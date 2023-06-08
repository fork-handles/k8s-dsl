// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.EmptyDirVolumeSource as model_EmptyDirVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_Volume.emptyDir(block: model_EmptyDirVolumeSource.() -> Unit = {}) {
    if (emptyDir == null) {
        emptyDir = model_EmptyDirVolumeSource()
    }

    emptyDir.block()
}
