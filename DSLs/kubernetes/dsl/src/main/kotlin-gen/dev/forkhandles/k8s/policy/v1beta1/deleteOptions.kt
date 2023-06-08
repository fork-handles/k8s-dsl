// GENERATED
package dev.forkhandles.k8s.policy.v1beta1

import io.fabric8.kubernetes.api.model.DeleteOptions as model_DeleteOptions
import io.fabric8.kubernetes.api.model.policy.v1beta1.Eviction as v1beta1_Eviction

fun v1beta1_Eviction.deleteOptions(block: model_DeleteOptions.() -> Unit = {}) {
    if (deleteOptions == null) {
        deleteOptions = model_DeleteOptions()
    }

    deleteOptions.block()
}
