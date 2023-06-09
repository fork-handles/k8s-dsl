// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.GlusterfsPersistentVolumeSource as model_GlusterfsPersistentVolumeSource
import io.fabric8.kubernetes.api.model.GlusterfsVolumeSource as model_GlusterfsVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.glusterfs(block: model_GlusterfsPersistentVolumeSource.() -> Unit = {}) {
    if (glusterfs == null) {
        glusterfs = model_GlusterfsPersistentVolumeSource()
    }

    glusterfs.block()
}

fun model_Volume.glusterfs(block: model_GlusterfsVolumeSource.() -> Unit = {}) {
    if (glusterfs == null) {
        glusterfs = model_GlusterfsVolumeSource()
    }

    glusterfs.block()
}
