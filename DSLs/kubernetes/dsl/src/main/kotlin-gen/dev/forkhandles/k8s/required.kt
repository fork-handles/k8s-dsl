// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.NodeSelector as model_NodeSelector
import io.fabric8.kubernetes.api.model.VolumeNodeAffinity as model_VolumeNodeAffinity

fun model_VolumeNodeAffinity.required(block: model_NodeSelector.() -> Unit = {}) {
    if (required == null) {
        required = model_NodeSelector()
    }

    required.block()
}
