// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.PodAffinityTerm as model_PodAffinityTerm

fun model_PodAffinityTerm.namespaceSelector(block: model_LabelSelector.() -> Unit = {}) {
    if (namespaceSelector == null) {
        namespaceSelector = model_LabelSelector()
    }

    namespaceSelector.block()
}
