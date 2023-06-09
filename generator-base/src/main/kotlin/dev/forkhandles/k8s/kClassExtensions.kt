package dev.forkhandles.k8s

import com.google.common.reflect.ClassPath
import kotlin.reflect.KClass

val <T : Any> KClass<T>.packageName: String?
    get() = qualifiedName?.substringBeforeLast('.')

val <T : Any> KClass<T>.uniqueSimpleAlias: String?
    get() = this.qualifiedName?.split('.')?.takeLast(2)?.joinToString(separator = "_") ?: this.simpleName

object ClassFinder {
    fun findAllClassesOnClasspath(): Collection<KClass<*>> {
        return ClassPath.from(this::class.java.classLoader).allClasses.mapNotNull {
            try {
                it.load().kotlin
            } catch (e: Throwable) {
                null
            }
        }
    }
}
