// GENERATED
package dev.forkhandles.k8s.policy.v1

import io.fabric8.kubernetes.api.model.DeleteOptions as model_DeleteOptions
import io.fabric8.kubernetes.api.model.policy.v1.Eviction as v1_Eviction

fun v1_Eviction.deleteOptions(block: model_DeleteOptions.() -> Unit = {}) {
    if (deleteOptions == null) {
        deleteOptions = model_DeleteOptions()
    }

    deleteOptions.block()
}
