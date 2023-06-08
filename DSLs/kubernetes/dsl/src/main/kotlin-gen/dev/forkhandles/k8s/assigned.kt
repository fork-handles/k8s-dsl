// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.NodeConfigSource as model_NodeConfigSource
import io.fabric8.kubernetes.api.model.NodeConfigStatus as model_NodeConfigStatus

fun model_NodeConfigStatus.assigned(block: model_NodeConfigSource.() -> Unit = {}) {
    if (assigned == null) {
        assigned = model_NodeConfigSource()
    }

    assigned.block()
}
