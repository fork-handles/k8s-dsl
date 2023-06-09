// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.AzureDiskVolumeSource as model_AzureDiskVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.azureDisk(block: model_AzureDiskVolumeSource.() -> Unit = {}) {
    if (azureDisk == null) {
        azureDisk = model_AzureDiskVolumeSource()
    }

    azureDisk.block()
}

fun model_Volume.azureDisk(block: model_AzureDiskVolumeSource.() -> Unit = {}) {
    if (azureDisk == null) {
        azureDisk = model_AzureDiskVolumeSource()
    }

    azureDisk.block()
}
