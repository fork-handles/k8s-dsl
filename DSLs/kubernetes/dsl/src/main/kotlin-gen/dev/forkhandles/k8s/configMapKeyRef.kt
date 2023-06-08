// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ConfigMapKeySelector as model_ConfigMapKeySelector
import io.fabric8.kubernetes.api.model.EnvVarSource as model_EnvVarSource

fun model_EnvVarSource.configMapKeyRef(block: model_ConfigMapKeySelector.() -> Unit = {}) {
    if (configMapKeyRef == null) {
        configMapKeyRef = model_ConfigMapKeySelector()
    }

    configMapKeyRef.block()
}
