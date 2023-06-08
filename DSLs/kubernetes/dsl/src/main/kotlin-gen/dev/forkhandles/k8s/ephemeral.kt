// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.EphemeralVolumeSource as model_EphemeralVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_Volume.ephemeral(block: model_EphemeralVolumeSource.() -> Unit = {}) {
    if (ephemeral == null) {
        ephemeral = model_EphemeralVolumeSource()
    }

    ephemeral.block()
}
