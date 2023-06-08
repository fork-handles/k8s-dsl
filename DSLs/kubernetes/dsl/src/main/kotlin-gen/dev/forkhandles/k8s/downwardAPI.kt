// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.DownwardAPIProjection as model_DownwardAPIProjection
import io.fabric8.kubernetes.api.model.DownwardAPIVolumeSource as model_DownwardAPIVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume
import io.fabric8.kubernetes.api.model.VolumeProjection as model_VolumeProjection

fun model_Volume.downwardAPI(block: model_DownwardAPIVolumeSource.() -> Unit = {}) {
    if (downwardAPI == null) {
        downwardAPI = model_DownwardAPIVolumeSource()
    }

    downwardAPI.block()
}

fun model_VolumeProjection.downwardAPI(block: model_DownwardAPIProjection.() -> Unit = {}) {
    if (downwardAPI == null) {
        downwardAPI = model_DownwardAPIProjection()
    }

    downwardAPI.block()
}
