// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.FlockerVolumeSource as model_FlockerVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.flocker(block: model_FlockerVolumeSource.() -> Unit = {}) {
    if (flocker == null) {
        flocker = model_FlockerVolumeSource()
    }

    flocker.block()
}

fun model_Volume.flocker(block: model_FlockerVolumeSource.() -> Unit = {}) {
    if (flocker == null) {
        flocker = model_FlockerVolumeSource()
    }

    flocker.block()
}
