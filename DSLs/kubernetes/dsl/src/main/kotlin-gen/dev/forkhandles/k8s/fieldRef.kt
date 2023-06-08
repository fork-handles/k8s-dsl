// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile as model_DownwardAPIVolumeFile
import io.fabric8.kubernetes.api.model.EnvVarSource as model_EnvVarSource
import io.fabric8.kubernetes.api.model.ObjectFieldSelector as model_ObjectFieldSelector

fun model_DownwardAPIVolumeFile.fieldRef(block: model_ObjectFieldSelector.() -> Unit = {}) {
    if (fieldRef == null) {
        fieldRef = model_ObjectFieldSelector()
    }

    fieldRef.block()
}

fun model_EnvVarSource.fieldRef(block: model_ObjectFieldSelector.() -> Unit = {}) {
    if (fieldRef == null) {
        fieldRef = model_ObjectFieldSelector()
    }

    fieldRef.block()
}
