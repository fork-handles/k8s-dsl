// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDaemonSet as extensions_RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDeployment as extensions_RollingUpdateDeployment

fun extensions_RollingUpdateDaemonSet.maxUnavailable(block: model_IntOrString.() -> Unit = {}) {
    if (maxUnavailable == null) {
        maxUnavailable = model_IntOrString()
    }

    maxUnavailable.block()
}

fun extensions_RollingUpdateDeployment.maxUnavailable(block: model_IntOrString.() -> Unit = {}) {
    if (maxUnavailable == null) {
        maxUnavailable = model_IntOrString()
    }

    maxUnavailable.block()
}
