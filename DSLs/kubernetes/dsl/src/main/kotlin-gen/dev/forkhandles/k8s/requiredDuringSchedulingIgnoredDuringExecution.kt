// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.NodeAffinity as model_NodeAffinity
import io.fabric8.kubernetes.api.model.NodeSelector as model_NodeSelector

fun model_NodeAffinity.requiredDuringSchedulingIgnoredDuringExecution(block: model_NodeSelector.() -> Unit = {}) {
    if (requiredDuringSchedulingIgnoredDuringExecution == null) {
        requiredDuringSchedulingIgnoredDuringExecution = model_NodeSelector()
    }

    requiredDuringSchedulingIgnoredDuringExecution.block()
}
