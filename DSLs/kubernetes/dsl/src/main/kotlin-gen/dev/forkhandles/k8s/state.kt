// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ContainerState as model_ContainerState
import io.fabric8.kubernetes.api.model.ContainerStatus as model_ContainerStatus

fun model_ContainerStatus.state(block: model_ContainerState.() -> Unit = {}) {
    if (state == null) {
        state = model_ContainerState()
    }

    state.block()
}
