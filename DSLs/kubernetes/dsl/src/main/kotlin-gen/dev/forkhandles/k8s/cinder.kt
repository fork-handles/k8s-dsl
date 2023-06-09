// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.CinderPersistentVolumeSource as model_CinderPersistentVolumeSource
import io.fabric8.kubernetes.api.model.CinderVolumeSource as model_CinderVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.cinder(block: model_CinderPersistentVolumeSource.() -> Unit = {}) {
    if (cinder == null) {
        cinder = model_CinderPersistentVolumeSource()
    }

    cinder.block()
}

fun model_Volume.cinder(block: model_CinderVolumeSource.() -> Unit = {}) {
    if (cinder == null) {
        cinder = model_CinderVolumeSource()
    }

    cinder.block()
}
