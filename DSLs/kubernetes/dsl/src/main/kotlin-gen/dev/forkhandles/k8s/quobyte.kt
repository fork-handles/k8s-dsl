// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.QuobyteVolumeSource as model_QuobyteVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_PersistentVolumeSpec.quobyte(block: model_QuobyteVolumeSource.() -> Unit = {}) {
    if (quobyte == null) {
        quobyte = model_QuobyteVolumeSource()
    }

    quobyte.block()
}

fun model_Volume.quobyte(block: model_QuobyteVolumeSource.() -> Unit = {}) {
    if (quobyte == null) {
        quobyte = model_QuobyteVolumeSource()
    }

    quobyte.block()
}
