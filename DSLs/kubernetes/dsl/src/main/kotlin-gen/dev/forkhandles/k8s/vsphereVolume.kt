// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume
import io.fabric8.kubernetes.api.model.VsphereVirtualDiskVolumeSource as model_VsphereVirtualDiskVolumeSource

fun model_PersistentVolumeSpec.vsphereVolume(block: model_VsphereVirtualDiskVolumeSource.() -> Unit = {}) {
    if (vsphereVolume == null) {
        vsphereVolume = model_VsphereVirtualDiskVolumeSource()
    }

    vsphereVolume.block()
}

fun model_Volume.vsphereVolume(block: model_VsphereVirtualDiskVolumeSource.() -> Unit = {}) {
    if (vsphereVolume == null) {
        vsphereVolume = model_VsphereVirtualDiskVolumeSource()
    }

    vsphereVolume.block()
}
