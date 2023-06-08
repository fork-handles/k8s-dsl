// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource as model_CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.SecretReference as model_SecretReference

fun model_CSIPersistentVolumeSource.nodeExpandSecretRef(block: model_SecretReference.() -> Unit = {}) {
    if (nodeExpandSecretRef == null) {
        nodeExpandSecretRef = model_SecretReference()
    }

    nodeExpandSecretRef.block()
}
