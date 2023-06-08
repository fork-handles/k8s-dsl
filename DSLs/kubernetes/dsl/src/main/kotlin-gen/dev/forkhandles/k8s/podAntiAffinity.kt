// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Affinity as model_Affinity
import io.fabric8.kubernetes.api.model.PodAntiAffinity as model_PodAntiAffinity

fun model_Affinity.podAntiAffinity(block: model_PodAntiAffinity.() -> Unit = {}) {
    if (podAntiAffinity == null) {
        podAntiAffinity = model_PodAntiAffinity()
    }

    podAntiAffinity.block()
}
