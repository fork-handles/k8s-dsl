// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.extensions.DaemonSetSpec as extensions_DaemonSetSpec
import io.fabric8.kubernetes.api.model.extensions.DaemonSetUpdateStrategy as extensions_DaemonSetUpdateStrategy

fun extensions_DaemonSetSpec.updateStrategy(block: extensions_DaemonSetUpdateStrategy.() -> Unit = {}) {
    if (updateStrategy == null) {
        updateStrategy = extensions_DaemonSetUpdateStrategy()
    }

    updateStrategy.block()
}
