// GENERATED
package dev.forkhandles.k8s.networking.v1

import io.fabric8.kubernetes.api.model.networking.v1.IngressLoadBalancerStatus as v1_IngressLoadBalancerStatus
import io.fabric8.kubernetes.api.model.networking.v1.IngressStatus as v1_IngressStatus

fun v1_IngressStatus.loadBalancer(block: v1_IngressLoadBalancerStatus.() -> Unit = {}) {
    if (loadBalancer == null) {
        loadBalancer = v1_IngressLoadBalancerStatus()
    }

    loadBalancer.block()
}
