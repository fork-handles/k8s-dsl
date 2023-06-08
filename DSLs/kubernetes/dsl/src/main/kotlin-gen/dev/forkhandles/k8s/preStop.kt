// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Lifecycle as model_Lifecycle
import io.fabric8.kubernetes.api.model.LifecycleHandler as model_LifecycleHandler

fun model_Lifecycle.preStop(block: model_LifecycleHandler.() -> Unit = {}) {
    if (preStop == null) {
        preStop = model_LifecycleHandler()
    }

    preStop.block()
}
