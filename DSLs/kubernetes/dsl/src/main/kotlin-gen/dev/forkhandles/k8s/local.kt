// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.LocalVolumeSource as model_LocalVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec

fun model_PersistentVolumeSpec.local(block: model_LocalVolumeSource.() -> Unit = {}) {
    if (local == null) {
        local = model_LocalVolumeSource()
    }

    local.block()
}
