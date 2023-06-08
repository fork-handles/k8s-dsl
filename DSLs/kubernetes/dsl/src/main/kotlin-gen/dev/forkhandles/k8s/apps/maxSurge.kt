// GENERATED
package dev.forkhandles.k8s.apps

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDaemonSet as apps_RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeployment as apps_RollingUpdateDeployment

fun apps_RollingUpdateDaemonSet.maxSurge(block: model_IntOrString.() -> Unit = {}) {
    if (maxSurge == null) {
        maxSurge = model_IntOrString()
    }

    maxSurge.block()
}

fun apps_RollingUpdateDeployment.maxSurge(block: model_IntOrString.() -> Unit = {}) {
    if (maxSurge == null) {
        maxSurge = model_IntOrString()
    }

    maxSurge.block()
}
