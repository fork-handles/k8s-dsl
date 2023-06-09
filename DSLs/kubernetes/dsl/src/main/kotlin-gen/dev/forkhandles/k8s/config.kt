// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.NodeConfigStatus as model_NodeConfigStatus
import io.fabric8.kubernetes.api.model.NodeStatus as model_NodeStatus

fun model_NodeStatus.config(block: model_NodeConfigStatus.() -> Unit = {}) {
    if (config == null) {
        config = model_NodeConfigStatus()
    }

    config.block()
}
