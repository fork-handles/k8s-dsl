// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Capabilities as model_Capabilities
import io.fabric8.kubernetes.api.model.SecurityContext as model_SecurityContext

fun model_SecurityContext.capabilities(block: model_Capabilities.() -> Unit = {}) {
    if (capabilities == null) {
        capabilities = model_Capabilities()
    }

    capabilities.block()
}
