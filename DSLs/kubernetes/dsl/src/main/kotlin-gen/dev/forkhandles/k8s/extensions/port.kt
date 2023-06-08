// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPort as extensions_NetworkPolicyPort

fun extensions_NetworkPolicyPort.port(block: model_IntOrString.() -> Unit = {}) {
    if (this.port == null) {
        this.port = model_IntOrString()
    }

    this.port!!.block()
}
