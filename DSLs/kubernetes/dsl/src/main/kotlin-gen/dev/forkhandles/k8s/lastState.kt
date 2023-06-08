// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ContainerState as model_ContainerState
import io.fabric8.kubernetes.api.model.ContainerStatus as model_ContainerStatus

fun model_ContainerStatus.lastState(block: model_ContainerState.() -> Unit = {}) {
    if (lastState == null) {
        lastState = model_ContainerState()
    }

    lastState.block()
}
