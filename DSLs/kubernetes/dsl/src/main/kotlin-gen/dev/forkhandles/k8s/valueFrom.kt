// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.EnvVar as model_EnvVar
import io.fabric8.kubernetes.api.model.EnvVarSource as model_EnvVarSource

fun model_EnvVar.valueFrom(block: model_EnvVarSource.() -> Unit = {}) {
    if (valueFrom == null) {
        valueFrom = model_EnvVarSource()
    }

    valueFrom.block()
}
