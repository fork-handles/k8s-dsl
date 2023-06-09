// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.RBDPersistentVolumeSource as model_RBDPersistentVolumeSource
import io.fabric8.kubernetes.api.model.RBDVolumeSource as model_RBDVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.rbd(block: model_RBDPersistentVolumeSource.() -> Unit = {}) {
    if (rbd == null) {
        rbd = model_RBDPersistentVolumeSource()
    }

    rbd.block()
}

fun model_Volume.rbd(block: model_RBDVolumeSource.() -> Unit = {}) {
    if (rbd == null) {
        rbd = model_RBDVolumeSource()
    }

    rbd.block()
}
