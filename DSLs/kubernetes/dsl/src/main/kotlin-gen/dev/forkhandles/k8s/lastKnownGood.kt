// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.NodeConfigSource as model_NodeConfigSource
import io.fabric8.kubernetes.api.model.NodeConfigStatus as model_NodeConfigStatus

fun model_NodeConfigStatus.lastKnownGood(block: model_NodeConfigSource.() -> Unit = {}) {
    if (lastKnownGood == null) {
        lastKnownGood = model_NodeConfigSource()
    }

    lastKnownGood.block()
}
