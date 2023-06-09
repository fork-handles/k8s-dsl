// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.CephFSPersistentVolumeSource as model_CephFSPersistentVolumeSource
import io.fabric8.kubernetes.api.model.CephFSVolumeSource as model_CephFSVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.cephfs(block: model_CephFSPersistentVolumeSource.() -> Unit = {}) {
    if (cephfs == null) {
        cephfs = model_CephFSPersistentVolumeSource()
    }

    cephfs.block()
}

fun model_Volume.cephfs(block: model_CephFSVolumeSource.() -> Unit = {}) {
    if (cephfs == null) {
        cephfs = model_CephFSVolumeSource()
    }

    cephfs.block()
}
