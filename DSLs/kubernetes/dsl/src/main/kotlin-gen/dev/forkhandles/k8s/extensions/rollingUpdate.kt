// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.extensions.DaemonSetUpdateStrategy as extensions_DaemonSetUpdateStrategy
import io.fabric8.kubernetes.api.model.extensions.DeploymentStrategy as extensions_DeploymentStrategy
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDaemonSet as extensions_RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.extensions.RollingUpdateDeployment as extensions_RollingUpdateDeployment

fun extensions_DaemonSetUpdateStrategy.rollingUpdate(block: extensions_RollingUpdateDaemonSet.() -> Unit = {}) {
    if (rollingUpdate == null) {
        rollingUpdate = extensions_RollingUpdateDaemonSet()
    }

    rollingUpdate.block()
}

fun extensions_DeploymentStrategy.rollingUpdate(block: extensions_RollingUpdateDeployment.() -> Unit = {}) {
    if (rollingUpdate == null) {
        rollingUpdate = extensions_RollingUpdateDeployment()
    }

    rollingUpdate.block()
}
