// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.NFSVolumeSource as model_NFSVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.nfs(block: model_NFSVolumeSource.() -> Unit = {}) {
    if (nfs == null) {
        nfs = model_NFSVolumeSource()
    }

    nfs.block()
}

fun model_Volume.nfs(block: model_NFSVolumeSource.() -> Unit = {}) {
    if (nfs == null) {
        nfs = model_NFSVolumeSource()
    }

    nfs.block()
}
