// GENERATED
package dev.forkhandles.k8s.storage

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.storage.CSIStorageCapacity as storage_CSIStorageCapacity

fun storage_CSIStorageCapacity.maximumVolumeSize(block: model_Quantity.() -> Unit = {}) {
    if (maximumVolumeSize == null) {
        maximumVolumeSize = model_Quantity()
    }

    maximumVolumeSize.block()
}
