// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ConfigMapNodeConfigSource as model_ConfigMapNodeConfigSource
import io.fabric8.kubernetes.api.model.ConfigMapProjection as model_ConfigMapProjection
import io.fabric8.kubernetes.api.model.ConfigMapVolumeSource as model_ConfigMapVolumeSource
import io.fabric8.kubernetes.api.model.NodeConfigSource as model_NodeConfigSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume
import io.fabric8.kubernetes.api.model.VolumeProjection as model_VolumeProjection

fun model_NodeConfigSource.configMap(block: model_ConfigMapNodeConfigSource.() -> Unit = {}) {
    if (configMap == null) {
        configMap = model_ConfigMapNodeConfigSource()
    }

    configMap.block()
}

fun model_Volume.configMap(block: model_ConfigMapVolumeSource.() -> Unit = {}) {
    if (configMap == null) {
        configMap = model_ConfigMapVolumeSource()
    }

    configMap.block()
}

fun model_VolumeProjection.configMap(block: model_ConfigMapProjection.() -> Unit = {}) {
    if (configMap == null) {
        configMap = model_ConfigMapProjection()
    }

    configMap.block()
}
