package com.fkorotkov.kubernetes

import com.fkorotkov.kotlin.dsl.Generator
import io.fabric8.kubernetes.api.model.KubernetesResource
import java.io.File

fun main(args: Array<String>) {
    val outputFolder = File(args[0])

    if (outputFolder.exists()) {
        outputFolder.deleteRecursively()
    }
    Generator.generate(
        KubernetesResource::class,
        "io.fabric8.kubernetes.api.model",
        outputFolder,
        "com.fkorotkov.kubernetes",
    )
}
