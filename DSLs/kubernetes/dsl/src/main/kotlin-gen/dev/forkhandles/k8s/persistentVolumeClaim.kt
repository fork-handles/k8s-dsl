// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PersistentVolumeClaimVolumeSource as model_PersistentVolumeClaimVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_Volume.persistentVolumeClaim(block: model_PersistentVolumeClaimVolumeSource.() -> Unit = {}) {
    if (persistentVolumeClaim == null) {
        persistentVolumeClaim = model_PersistentVolumeClaimVolumeSource()
    }

    persistentVolumeClaim.block()
}
