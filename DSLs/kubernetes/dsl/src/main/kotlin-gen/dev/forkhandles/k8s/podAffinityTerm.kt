// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PodAffinityTerm as model_PodAffinityTerm
import io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm as model_WeightedPodAffinityTerm

fun model_WeightedPodAffinityTerm.podAffinityTerm(block: model_PodAffinityTerm.() -> Unit = {}) {
    if (podAffinityTerm == null) {
        podAffinityTerm = model_PodAffinityTerm()
    }

    podAffinityTerm.block()
}
