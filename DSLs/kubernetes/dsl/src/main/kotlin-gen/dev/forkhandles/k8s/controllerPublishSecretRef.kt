// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource as model_CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.SecretReference as model_SecretReference

fun model_CSIPersistentVolumeSource.controllerPublishSecretRef(block: model_SecretReference.() -> Unit = {}) {
    if (controllerPublishSecretRef == null) {
        controllerPublishSecretRef = model_SecretReference()
    }

    controllerPublishSecretRef.block()
}
