// GENERATED
package dev.forkhandles.k8s.discovery.v1

import io.fabric8.kubernetes.api.model.discovery.v1.Endpoint as v1_Endpoint
import io.fabric8.kubernetes.api.model.discovery.v1.EndpointHints as v1_EndpointHints

fun v1_Endpoint.hints(block: v1_EndpointHints.() -> Unit = {}) {
    if (hints == null) {
        hints = v1_EndpointHints()
    }

    hints.block()
}
