// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Affinity as model_Affinity
import io.fabric8.kubernetes.api.model.NodeAffinity as model_NodeAffinity
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.VolumeNodeAffinity as model_VolumeNodeAffinity

fun model_Affinity.nodeAffinity(block: model_NodeAffinity.() -> Unit = {}) {
    if (nodeAffinity == null) {
        nodeAffinity = model_NodeAffinity()
    }

    nodeAffinity.block()
}

fun model_PersistentVolumeSpec.nodeAffinity(block: model_VolumeNodeAffinity.() -> Unit = {}) {
    if (nodeAffinity == null) {
        nodeAffinity = model_VolumeNodeAffinity()
    }

    nodeAffinity.block()
}
