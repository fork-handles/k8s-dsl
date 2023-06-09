// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Affinity as model_Affinity
import io.fabric8.kubernetes.api.model.PodAffinity as model_PodAffinity

fun model_Affinity.podAffinity(block: model_PodAffinity.() -> Unit = {}) {
    if (podAffinity == null) {
        podAffinity = model_PodAffinity()
    }

    podAffinity.block()
}
