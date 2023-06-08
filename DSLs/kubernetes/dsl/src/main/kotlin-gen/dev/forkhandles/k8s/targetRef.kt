// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.EndpointAddress as model_EndpointAddress
import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference

fun model_EndpointAddress.targetRef(block: model_ObjectReference.() -> Unit = {}) {
    if (targetRef == null) {
        targetRef = model_ObjectReference()
    }

    targetRef.block()
}
