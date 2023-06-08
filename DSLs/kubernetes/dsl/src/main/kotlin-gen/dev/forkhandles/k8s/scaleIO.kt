// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.ScaleIOPersistentVolumeSource as model_ScaleIOPersistentVolumeSource
import io.fabric8.kubernetes.api.model.ScaleIOVolumeSource as model_ScaleIOVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.scaleIO(block: model_ScaleIOPersistentVolumeSource.() -> Unit = {}) {
    if (scaleIO == null) {
        scaleIO = model_ScaleIOPersistentVolumeSource()
    }

    scaleIO.block()
}

fun model_Volume.scaleIO(block: model_ScaleIOVolumeSource.() -> Unit = {}) {
    if (scaleIO == null) {
        scaleIO = model_ScaleIOVolumeSource()
    }

    scaleIO.block()
}
