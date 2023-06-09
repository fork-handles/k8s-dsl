package dev.forkhandles.k8s.dsl

import dev.forkhandles.k8s.uniqueSimpleAlias
import java.io.File
import java.util.Collections
import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty

object BuilderGenerator {
    fun generateBuildersForPropertyFile(
        outputFolder: File,
        outputPackage: String,
        outputFileName: String,
        clazzToProperties: List<Pair<KClass<*>, KMutableProperty<*>>>
    ) {
        val destinationFolder = File(outputFolder, outputPackage.replace('.', File.separatorChar))
        if (!destinationFolder.exists()) {
            destinationFolder.mkdirs()
        }
        val destinationFile = File(destinationFolder, outputFileName)
        destinationFile.createNewFile()

        val allClasses = clazzToProperties.flatMap { (clazz, property) ->
            listOf(clazz, property.returnType.classifier as KClass<*>)
        }

        destinationFile.writeText(generateBuilders(allClasses, clazzToProperties, outputPackage))
    }

    private fun generateBuilders(
        allClasses: List<KClass<*>>,
        clazzToProperties: List<Pair<KClass<*>, KMutableProperty<*>>>,
        outputPackage: String
    ): String {
        return """// GENERATED
package $outputPackage

${
            allClasses.map { "import ${it.qualifiedName} as ${it.uniqueSimpleAlias}" }.toSet().sorted()
                .joinToString("\n")
        }
${
            clazzToProperties.map { (clazz, property) -> extensionFunctionTemplate(clazz, property) }.joinToString("\n")
        }
"""
    }

    private fun extensionFunctionTemplate(clazz: KClass<*>, property: KMutableProperty<*>): String {
        val returnClass = property.returnType.classifier as KClass<*>
        val generics: List<String> = (1..clazz.typeParameters.size).map { "T$it" }

        val clazzDecl = clazz.uniqueSimpleAlias + genericsTemplate(generics)
        val returnClassDecl =
            returnClass.uniqueSimpleAlias + genericsTemplate(Collections.nCopies(returnClass.typeParameters.size, "*"))

        val propertyName = sanitizePropertyName(property.name)
        return """
fun${if (generics.isEmpty()) "" else " "}${genericsTemplate(generics)} $clazzDecl.$propertyName(block: $returnClassDecl.() -> Unit = {}) {${
            initializer(
                property,
                returnClass
            )
        }
    $propertyName.block()
}
""".trimEnd()
    }

    private fun initializer(property: KMutableProperty<*>, returnClass: KClass<*>): String {
        if (returnClass.isAbstract) return ""
        val propertyName = sanitizePropertyName(property.name)
        return """
    if ($propertyName == null) {
        $propertyName = ${returnClass.uniqueSimpleAlias}()
    }
"""
    }

    private fun sanitizePropertyName(name: String) = name
        .removePrefix("_") // remove "_" for names as Java keywords
        .run { if (this == "object") "`object`" else this }

    private fun genericsTemplate(generics: List<String>): String {
        if (generics.isEmpty()) {
            return ""
        } else {
            return generics.joinToString(
                separator = ", ",
                prefix = "<",
                postfix = ">"
            )
        }
    }
}
