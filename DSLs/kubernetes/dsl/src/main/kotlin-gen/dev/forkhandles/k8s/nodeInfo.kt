// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.NodeStatus as model_NodeStatus
import io.fabric8.kubernetes.api.model.NodeSystemInfo as model_NodeSystemInfo

fun model_NodeStatus.nodeInfo(block: model_NodeSystemInfo.() -> Unit = {}) {
    if (nodeInfo == null) {
        nodeInfo = model_NodeSystemInfo()
    }

    nodeInfo.block()
}
