// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ConfigMapEnvSource as model_ConfigMapEnvSource
import io.fabric8.kubernetes.api.model.EnvFromSource as model_EnvFromSource

fun model_EnvFromSource.configMapRef(block: model_ConfigMapEnvSource.() -> Unit = {}) {
    if (configMapRef == null) {
        configMapRef = model_ConfigMapEnvSource()
    }

    configMapRef.block()
}
