// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.PhotonPersistentDiskVolumeSource as model_PhotonPersistentDiskVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.photonPersistentDisk(block: model_PhotonPersistentDiskVolumeSource.() -> Unit = {}) {
    if (photonPersistentDisk == null) {
        photonPersistentDisk = model_PhotonPersistentDiskVolumeSource()
    }

    photonPersistentDisk.block()
}

fun model_Volume.photonPersistentDisk(block: model_PhotonPersistentDiskVolumeSource.() -> Unit = {}) {
    if (photonPersistentDisk == null) {
        photonPersistentDisk = model_PhotonPersistentDiskVolumeSource()
    }

    photonPersistentDisk.block()
}
