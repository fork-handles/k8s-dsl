// GENERATED
package dev.forkhandles.k8s.apps

import io.fabric8.kubernetes.api.model.apps.DeploymentSpec as apps_DeploymentSpec
import io.fabric8.kubernetes.api.model.apps.DeploymentStrategy as apps_DeploymentStrategy

fun apps_DeploymentSpec.strategy(block: apps_DeploymentStrategy.() -> Unit = {}) {
    if (strategy == null) {
        strategy = apps_DeploymentStrategy()
    }

    strategy.block()
}
