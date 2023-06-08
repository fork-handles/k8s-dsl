// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.extensions.IngressLoadBalancerStatus as extensions_IngressLoadBalancerStatus
import io.fabric8.kubernetes.api.model.extensions.IngressStatus as extensions_IngressStatus

fun extensions_IngressStatus.loadBalancer(block: extensions_IngressLoadBalancerStatus.() -> Unit = {}) {
    if (loadBalancer == null) {
        loadBalancer = extensions_IngressLoadBalancerStatus()
    }

    loadBalancer.block()
}
