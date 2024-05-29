// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.NodeRuntimeHandler as model_NodeRuntimeHandler
import io.fabric8.kubernetes.api.model.NodeRuntimeHandlerFeatures as model_NodeRuntimeHandlerFeatures

fun model_NodeRuntimeHandler.features(block: model_NodeRuntimeHandlerFeatures.() -> Unit = {}) {
    if (features == null) {
        features = model_NodeRuntimeHandlerFeatures()
    }

    features.block()
}
