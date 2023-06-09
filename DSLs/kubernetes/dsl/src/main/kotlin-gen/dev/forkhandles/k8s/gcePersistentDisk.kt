// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.GCEPersistentDiskVolumeSource as model_GCEPersistentDiskVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.gcePersistentDisk(block: model_GCEPersistentDiskVolumeSource.() -> Unit = {}) {
    if (gcePersistentDisk == null) {
        gcePersistentDisk = model_GCEPersistentDiskVolumeSource()
    }

    gcePersistentDisk.block()
}

fun model_Volume.gcePersistentDisk(block: model_GCEPersistentDiskVolumeSource.() -> Unit = {}) {
    if (gcePersistentDisk == null) {
        gcePersistentDisk = model_GCEPersistentDiskVolumeSource()
    }

    gcePersistentDisk.block()
}
