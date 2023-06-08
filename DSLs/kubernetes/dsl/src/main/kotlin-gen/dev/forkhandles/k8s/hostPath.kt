// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.HostPathVolumeSource as model_HostPathVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.hostPath(block: model_HostPathVolumeSource.() -> Unit = {}) {
    if (hostPath == null) {
        hostPath = model_HostPathVolumeSource()
    }

    hostPath.block()
}

fun model_Volume.hostPath(block: model_HostPathVolumeSource.() -> Unit = {}) {
    if (hostPath == null) {
        hostPath = model_HostPathVolumeSource()
    }

    hostPath.block()
}
