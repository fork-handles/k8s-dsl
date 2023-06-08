// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.extensions.DeploymentSpec as extensions_DeploymentSpec
import io.fabric8.kubernetes.api.model.extensions.DeploymentStrategy as extensions_DeploymentStrategy

fun extensions_DeploymentSpec.strategy(block: extensions_DeploymentStrategy.() -> Unit = {}) {
    if (strategy == null) {
        strategy = extensions_DeploymentStrategy()
    }

    strategy.block()
}
