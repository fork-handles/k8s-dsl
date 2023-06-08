// GENERATED
package dev.forkhandles.k8s.networking.v1

import io.fabric8.kubernetes.api.model.TypedLocalObjectReference as model_TypedLocalObjectReference
import io.fabric8.kubernetes.api.model.networking.v1.IngressBackend as v1_IngressBackend

fun v1_IngressBackend.resource(block: model_TypedLocalObjectReference.() -> Unit = {}) {
    if (this.resource == null) {
        this.resource = model_TypedLocalObjectReference()
    }

    this.resource!!.block()
}