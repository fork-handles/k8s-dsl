// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PodOS as model_PodOS
import io.fabric8.kubernetes.api.model.PodSpec as model_PodSpec

fun model_PodSpec.os(block: model_PodOS.() -> Unit = {}) {
    if (os == null) {
        os = model_PodOS()
    }

    os.block()
}
