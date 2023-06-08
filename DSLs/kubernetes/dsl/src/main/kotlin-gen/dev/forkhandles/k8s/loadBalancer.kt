// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.LoadBalancerStatus as model_LoadBalancerStatus
import io.fabric8.kubernetes.api.model.ServiceStatus as model_ServiceStatus


fun model_ServiceStatus.loadBalancer(block: model_LoadBalancerStatus.() -> Unit = {}) {
    if (this.loadBalancer == null) {
        this.loadBalancer = model_LoadBalancerStatus()
    }

    this.loadBalancer!!.block()
}

