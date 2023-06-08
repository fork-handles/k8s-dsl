// GENERATED
package dev.forkhandles.k8s.storage.v1beta1

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.storage.v1beta1.CSIStorageCapacity as v1beta1_CSIStorageCapacity

fun v1beta1_CSIStorageCapacity.capacity(block: model_Quantity.() -> Unit = {}) {
    if (capacity == null) {
        capacity = model_Quantity()
    }

    capacity.block()
}
