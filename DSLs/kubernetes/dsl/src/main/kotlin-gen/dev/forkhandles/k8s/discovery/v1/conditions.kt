// GENERATED
package dev.forkhandles.k8s.discovery.v1

import io.fabric8.kubernetes.api.model.discovery.v1.Endpoint as v1_Endpoint
import io.fabric8.kubernetes.api.model.discovery.v1.EndpointConditions as v1_EndpointConditions

fun v1_Endpoint.conditions(block: v1_EndpointConditions.() -> Unit = {}) {
    if (conditions == null) {
        conditions = v1_EndpointConditions()
    }

    conditions.block()
}
