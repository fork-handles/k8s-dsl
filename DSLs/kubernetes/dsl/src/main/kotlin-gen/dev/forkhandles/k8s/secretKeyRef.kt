// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.EnvVarSource as model_EnvVarSource
import io.fabric8.kubernetes.api.model.SecretKeySelector as model_SecretKeySelector

fun model_EnvVarSource.secretKeyRef(block: model_SecretKeySelector.() -> Unit = {}) {
    if (secretKeyRef == null) {
        secretKeyRef = model_SecretKeySelector()
    }

    secretKeyRef.block()
}
