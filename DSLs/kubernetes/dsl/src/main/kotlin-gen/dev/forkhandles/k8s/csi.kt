// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource as model_CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.CSIVolumeSource as model_CSIVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.csi(block: model_CSIPersistentVolumeSource.() -> Unit = {}) {
    if (csi == null) {
        csi = model_CSIPersistentVolumeSource()
    }

    csi.block()
}

fun model_Volume.csi(block: model_CSIVolumeSource.() -> Unit = {}) {
    if (csi == null) {
        csi = model_CSIVolumeSource()
    }

    csi.block()
}
