// GENERATED
package dev.forkhandles.k8s.storage.v1beta1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSIStorageCapacity as v1beta1_CSIStorageCapacity

fun v1beta1_CSIStorageCapacity.nodeTopology(block: model_LabelSelector.() -> Unit = {}) {
    if (nodeTopology == null) {
        nodeTopology = model_LabelSelector()
    }

    nodeTopology.block()
}
