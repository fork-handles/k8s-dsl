// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource as model_CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.SecretReference as model_SecretReference

fun model_CSIPersistentVolumeSource.controllerExpandSecretRef(block: model_SecretReference.() -> Unit = {}) {
    if (controllerExpandSecretRef == null) {
        controllerExpandSecretRef = model_SecretReference()
    }

    controllerExpandSecretRef.block()
}
