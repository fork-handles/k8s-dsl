// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ContainerState as model_ContainerState
import io.fabric8.kubernetes.api.model.ContainerStateRunning as model_ContainerStateRunning

fun model_ContainerState.running(block: model_ContainerStateRunning.() -> Unit = {}) {
    if (running == null) {
        running = model_ContainerStateRunning()
    }

    running.block()
}
