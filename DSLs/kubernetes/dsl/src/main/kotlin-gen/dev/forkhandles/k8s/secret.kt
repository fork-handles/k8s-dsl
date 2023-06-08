// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.SecretProjection as model_SecretProjection
import io.fabric8.kubernetes.api.model.SecretVolumeSource as model_SecretVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume
import io.fabric8.kubernetes.api.model.VolumeProjection as model_VolumeProjection

fun model_Volume.secret(block: model_SecretVolumeSource.() -> Unit = {}) {
    if (secret == null) {
        secret = model_SecretVolumeSource()
    }

    secret.block()
}

fun model_VolumeProjection.secret(block: model_SecretProjection.() -> Unit = {}) {
    if (secret == null) {
        secret = model_SecretProjection()
    }

    secret.block()
}
