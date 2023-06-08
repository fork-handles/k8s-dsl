// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.EphemeralVolumeSource as model_EphemeralVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimTemplate as model_PersistentVolumeClaimTemplate

fun model_EphemeralVolumeSource.volumeClaimTemplate(block: model_PersistentVolumeClaimTemplate.() -> Unit = {}) {
    if (volumeClaimTemplate == null) {
        volumeClaimTemplate = model_PersistentVolumeClaimTemplate()
    }

    volumeClaimTemplate.block()
}
