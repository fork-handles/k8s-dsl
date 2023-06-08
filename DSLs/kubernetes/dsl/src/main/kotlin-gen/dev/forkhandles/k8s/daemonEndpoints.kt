// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.NodeDaemonEndpoints as model_NodeDaemonEndpoints
import io.fabric8.kubernetes.api.model.NodeStatus as model_NodeStatus

fun model_NodeStatus.daemonEndpoints(block: model_NodeDaemonEndpoints.() -> Unit = {}) {
    if (daemonEndpoints == null) {
        daemonEndpoints = model_NodeDaemonEndpoints()
    }

    daemonEndpoints.block()
}
