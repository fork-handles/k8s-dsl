// GENERATED
package dev.forkhandles.k8s.discovery.v1beta1

import io.fabric8.kubernetes.api.model.discovery.v1beta1.Endpoint as v1beta1_Endpoint
import io.fabric8.kubernetes.api.model.discovery.v1beta1.EndpointHints as v1beta1_EndpointHints

fun v1beta1_Endpoint.hints(block: v1beta1_EndpointHints.() -> Unit = {}) {
    if (hints == null) {
        hints = v1beta1_EndpointHints()
    }

    hints.block()
}
