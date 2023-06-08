// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.extensions.IngressBackend as extensions_IngressBackend

fun extensions_IngressBackend.servicePort(block: model_IntOrString.() -> Unit = {}) {
    if (servicePort == null) {
        servicePort = model_IntOrString()
    }

    servicePort.block()
}
