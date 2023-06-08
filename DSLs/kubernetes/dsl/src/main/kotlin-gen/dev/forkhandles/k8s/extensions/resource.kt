// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.TypedLocalObjectReference as model_TypedLocalObjectReference
import io.fabric8.kubernetes.api.model.extensions.IngressBackend as extensions_IngressBackend

fun extensions_IngressBackend.resource(block: model_TypedLocalObjectReference.() -> Unit = {}) {
    if (resource == null) {
        resource = model_TypedLocalObjectReference()
    }

    resource.block()
}
