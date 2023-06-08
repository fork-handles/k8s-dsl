// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Affinity as model_Affinity
import io.fabric8.kubernetes.api.model.PodSpec as model_PodSpec

fun model_PodSpec.affinity(block: model_Affinity.() -> Unit = {}) {
    if (affinity == null) {
        affinity = model_Affinity()
    }

    affinity.block()
}
