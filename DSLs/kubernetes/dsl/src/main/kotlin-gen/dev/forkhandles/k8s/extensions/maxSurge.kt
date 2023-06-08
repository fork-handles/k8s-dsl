// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDaemonSet as extensions_RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDeployment as extensions_RollingUpdateDeployment

fun extensions_RollingUpdateDaemonSet.maxSurge(block: model_IntOrString.() -> Unit = {}) {
    if (maxSurge == null) {
        maxSurge = model_IntOrString()
    }

    maxSurge.block()
}

fun extensions_RollingUpdateDeployment.maxSurge(block: model_IntOrString.() -> Unit = {}) {
    if (maxSurge == null) {
        maxSurge = model_IntOrString()
    }

    maxSurge.block()
}
