package dev.forkhandles.k8s.dsl

import dev.forkhandles.k8s.ClassFinder
import dev.forkhandles.k8s.packageName
import java.io.File
import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.isSubclassOf
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.javaField

object Generator {
    fun generate(
        clazz: KClass<*>,
        inputBasePackage: String,
        outputFolder: File,
        outputPackage: String,
        excludePackagesPrefixes: Set<String> = emptySet()
    ) {
        val allClasses = ClassFinder.findAllClassesOnClasspath()
            .filter { kClass ->
                try {
                    kClass.isSubclassOf(clazz)
                } catch (e: Throwable) {
                    false
                }
            }
            .filterNot { kClass -> excludePackagesPrefixes.any { kClass.java.`package`.name.startsWith(it) } }
            .filterNot { kClass -> kClass.isAbstract || kClass.typeParameters.isNotEmpty() }

        allClasses.flatMap { subClazz ->
            subClazz.memberProperties.mapNotNull {
                it as? KMutableProperty<*>
            }.filter {
                // we don't care about primitive or standard types
                val classifier = it.returnType.classifier
                classifier is KClass<*> &&
                        !(classifier.qualifiedName?.startsWith("java.") ?: true) &&
                        !(classifier.qualifiedName?.startsWith("kotlin.") ?: true)
            }
        }.mapNotNull { property ->
            property.javaField?.declaringClass?.kotlin?.let { it to property }
        }.filter { (clazz, _) ->
            clazz.qualifiedName?.startsWith(inputBasePackage) ?: false
        }.distinctBy { (clazz, property) ->
            "${clazz.qualifiedName}#${property.name}"
        }.groupBy { (clazz, property) ->
            clazz.packageName to property.name
        }.forEach { (packageName, propertyName), clazzToProperties ->
            val packageSuffix = packageName?.removePrefix(inputBasePackage)?.split('.')?.filter { it.isNotBlank() }
                ?: emptyList()
            BuilderGenerator.generateBuildersForPropertyFile(
                outputFolder,
                (listOf(outputPackage) + packageSuffix).joinToString(separator = "."),
                "$propertyName.kt",
                clazzToProperties.sortedBy { it.first.simpleName }
            )
        }

        allClasses.filter {
            it.packageName?.startsWith(inputBasePackage) ?: false
        }.groupBy {
            it.packageName ?: inputBasePackage
        }.forEach { packageName, classes ->
            val packageSuffix = packageName.removePrefix(inputBasePackage).split('.').filter { it.isNotBlank() }
            ClassBuilderGenerator.generateClassBuilders(
                outputFolder,
                (listOf(outputPackage) + packageSuffix).joinToString(separator = "."),
                "ClassBuilders.kt",
                classes
            )
        }
    }
}
