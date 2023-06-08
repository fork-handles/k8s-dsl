// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Container as model_Container
import io.fabric8.kubernetes.api.model.EphemeralContainer as model_EphemeralContainer
import io.fabric8.kubernetes.api.model.Lifecycle as model_Lifecycle

fun model_Container.lifecycle(block: model_Lifecycle.() -> Unit = {}) {
    if (lifecycle == null) {
        lifecycle = model_Lifecycle()
    }

    lifecycle.block()
}

fun model_EphemeralContainer.lifecycle(block: model_Lifecycle.() -> Unit = {}) {
    if (lifecycle == null) {
        lifecycle = model_Lifecycle()
    }

    lifecycle.block()
}
