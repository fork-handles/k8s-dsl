// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource as model_CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.CSIVolumeSource as model_CSIVolumeSource
import io.fabric8.kubernetes.api.model.LocalObjectReference as model_LocalObjectReference
import io.fabric8.kubernetes.api.model.SecretReference as model_SecretReference

fun model_CSIPersistentVolumeSource.nodePublishSecretRef(block: model_SecretReference.() -> Unit = {}) {
    if (nodePublishSecretRef == null) {
        nodePublishSecretRef = model_SecretReference()
    }

    nodePublishSecretRef.block()
}

fun model_CSIVolumeSource.nodePublishSecretRef(block: model_LocalObjectReference.() -> Unit = {}) {
    if (nodePublishSecretRef == null) {
        nodePublishSecretRef = model_LocalObjectReference()
    }

    nodePublishSecretRef.block()
}
