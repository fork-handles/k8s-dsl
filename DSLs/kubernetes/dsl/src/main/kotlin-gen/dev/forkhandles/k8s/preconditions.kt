// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.DeleteOptions as model_DeleteOptions
import io.fabric8.kubernetes.api.model.Preconditions as model_Preconditions

fun model_DeleteOptions.preconditions(block: model_Preconditions.() -> Unit = {}) {
    if (preconditions == null) {
        preconditions = model_Preconditions()
    }

    preconditions.block()
}
