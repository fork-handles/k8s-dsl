// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.DaemonEndpoint as model_DaemonEndpoint
import io.fabric8.kubernetes.api.model.NodeDaemonEndpoints as model_NodeDaemonEndpoints


fun model_NodeDaemonEndpoints.kubeletEndpoint(block: model_DaemonEndpoint.() -> Unit = {}) {
    if (this.kubeletEndpoint == null) {
        this.kubeletEndpoint = model_DaemonEndpoint()
    }

    this.kubeletEndpoint!!.block()
}

