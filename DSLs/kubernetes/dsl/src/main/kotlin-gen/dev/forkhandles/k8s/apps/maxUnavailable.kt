// GENERATED
package dev.forkhandles.k8s.apps

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDaemonSet as apps_RollingUpdateDaemonSet
import io.fabric8.kubernetes.api.model.apps.RollingUpdateDeployment as apps_RollingUpdateDeployment
import io.fabric8.kubernetes.api.model.apps.RollingUpdateStatefulSetStrategy as apps_RollingUpdateStatefulSetStrategy

fun apps_RollingUpdateDaemonSet.maxUnavailable(block: model_IntOrString.() -> Unit = {}) {
    if (maxUnavailable == null) {
        maxUnavailable = model_IntOrString()
    }

    maxUnavailable.block()
}

fun apps_RollingUpdateDeployment.maxUnavailable(block: model_IntOrString.() -> Unit = {}) {
    if (maxUnavailable == null) {
        maxUnavailable = model_IntOrString()
    }

    maxUnavailable.block()
}

fun apps_RollingUpdateStatefulSetStrategy.maxUnavailable(block: model_IntOrString.() -> Unit = {}) {
    if (maxUnavailable == null) {
        maxUnavailable = model_IntOrString()
    }

    maxUnavailable.block()
}
