// GENERATED
package dev.forkhandles.k8s.storage

import io.fabric8.kubernetes.api.model.storage.CSINodeDriver as storage_CSINodeDriver
import io.fabric8.kubernetes.api.model.storage.VolumeNodeResources as storage_VolumeNodeResources

fun storage_CSINodeDriver.allocatable(block: storage_VolumeNodeResources.() -> Unit = {}) {
    if (allocatable == null) {
        allocatable = storage_VolumeNodeResources()
    }

    allocatable.block()
}
