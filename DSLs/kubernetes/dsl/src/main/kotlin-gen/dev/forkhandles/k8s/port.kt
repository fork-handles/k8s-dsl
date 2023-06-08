// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.HTTPGetAction as model_HTTPGetAction
import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.TCPSocketAction as model_TCPSocketAction

fun model_HTTPGetAction.port(block: model_IntOrString.() -> Unit = {}) {
    if (port == null) {
        port = model_IntOrString()
    }

    port.block()
}

fun model_TCPSocketAction.port(block: model_IntOrString.() -> Unit = {}) {
    if (port == null) {
        port = model_IntOrString()
    }

    port.block()
}
