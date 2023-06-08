// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ContainerState as model_ContainerState
import io.fabric8.kubernetes.api.model.ContainerStateTerminated as model_ContainerStateTerminated

fun model_ContainerState.terminated(block: model_ContainerStateTerminated.() -> Unit = {}) {
    if (terminated == null) {
        terminated = model_ContainerStateTerminated()
    }

    terminated.block()
}
