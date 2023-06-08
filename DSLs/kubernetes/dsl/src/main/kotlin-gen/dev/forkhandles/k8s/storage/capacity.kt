// GENERATED
package dev.forkhandles.k8s.storage

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.storage.CSIStorageCapacity as storage_CSIStorageCapacity

fun storage_CSIStorageCapacity.capacity(block: model_Quantity.() -> Unit = {}) {
    if (capacity == null) {
        capacity = model_Quantity()
    }

    capacity.block()
}
