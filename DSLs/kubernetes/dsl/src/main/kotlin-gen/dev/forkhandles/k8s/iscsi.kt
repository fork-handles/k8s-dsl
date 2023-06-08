// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ISCSIPersistentVolumeSource as model_ISCSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.ISCSIVolumeSource as model_ISCSIVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.iscsi(block: model_ISCSIPersistentVolumeSource.() -> Unit = {}) {
    if (iscsi == null) {
        iscsi = model_ISCSIPersistentVolumeSource()
    }

    iscsi.block()
}

fun model_Volume.iscsi(block: model_ISCSIVolumeSource.() -> Unit = {}) {
    if (iscsi == null) {
        iscsi = model_ISCSIVolumeSource()
    }

    iscsi.block()
}
