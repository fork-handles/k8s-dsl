// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ContainerState as model_ContainerState
import io.fabric8.kubernetes.api.model.ContainerStateWaiting as model_ContainerStateWaiting

fun model_ContainerState.waiting(block: model_ContainerStateWaiting.() -> Unit = {}) {
    if (waiting == null) {
        waiting = model_ContainerStateWaiting()
    }

    waiting.block()
}
