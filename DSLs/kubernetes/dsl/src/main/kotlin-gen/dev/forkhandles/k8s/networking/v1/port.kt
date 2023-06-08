// GENERATED
package dev.forkhandles.k8s.networking.v1

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.networking.v1.IngressServiceBackend as v1_IngressServiceBackend
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicyPort as v1_NetworkPolicyPort
import io.fabric8.kubernetes.api.model.networking.v1.ServiceBackendPort as v1_ServiceBackendPort

fun v1_IngressServiceBackend.port(block: v1_ServiceBackendPort.() -> Unit = {}) {
    if (port == null) {
        port = v1_ServiceBackendPort()
    }

    port.block()
}

fun v1_NetworkPolicyPort.port(block: model_IntOrString.() -> Unit = {}) {
    if (port == null) {
        port = model_IntOrString()
    }

    port.block()
}
