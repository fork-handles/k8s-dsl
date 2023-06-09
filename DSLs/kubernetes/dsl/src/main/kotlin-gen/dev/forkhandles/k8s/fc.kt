// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.FCVolumeSource as model_FCVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.fc(block: model_FCVolumeSource.() -> Unit = {}) {
    if (fc == null) {
        fc = model_FCVolumeSource()
    }

    fc.block()
}

fun model_Volume.fc(block: model_FCVolumeSource.() -> Unit = {}) {
    if (fc == null) {
        fc = model_FCVolumeSource()
    }

    fc.block()
}
