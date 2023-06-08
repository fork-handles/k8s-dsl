// GENERATED
package dev.forkhandles.k8s.storage

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.storage.CSIStorageCapacity as storage_CSIStorageCapacity

fun storage_CSIStorageCapacity.nodeTopology(block: model_LabelSelector.() -> Unit = {}) {
    if (nodeTopology == null) {
        nodeTopology = model_LabelSelector()
    }

    nodeTopology.block()
}
