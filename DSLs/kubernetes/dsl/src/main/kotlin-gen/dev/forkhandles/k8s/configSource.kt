// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.NodeConfigSource as model_NodeConfigSource
import io.fabric8.kubernetes.api.model.NodeSpec as model_NodeSpec

fun model_NodeSpec.configSource(block: model_NodeConfigSource.() -> Unit = {}) {
    if (configSource == null) {
        configSource = model_NodeConfigSource()
    }

    configSource.block()
}
