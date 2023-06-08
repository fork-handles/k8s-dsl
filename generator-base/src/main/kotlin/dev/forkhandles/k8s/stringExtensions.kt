package dev.forkhandles.k8s

import java.util.Locale

fun String.capitalise() = replaceFirstChar { it.titlecase(Locale.getDefault()) }
fun String.decapitalise() = replaceFirstChar { it.lowercase(Locale.getDefault()) }
