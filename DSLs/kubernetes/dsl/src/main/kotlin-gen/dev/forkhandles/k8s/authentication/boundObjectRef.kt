// GENERATED
package dev.forkhandles.k8s.authentication

import io.fabric8.kubernetes.api.model.authentication.BoundObjectReference as authentication_BoundObjectReference
import io.fabric8.kubernetes.api.model.authentication.TokenRequestSpec as authentication_TokenRequestSpec

fun authentication_TokenRequestSpec.boundObjectRef(block: authentication_BoundObjectReference.() -> Unit = {}) {
    if (boundObjectRef == null) {
        boundObjectRef = authentication_BoundObjectReference()
    }

    boundObjectRef.block()
}
