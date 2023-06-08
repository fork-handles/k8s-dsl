// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Event as model_Event
import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference

fun model_Event.involvedObject(block: model_ObjectReference.() -> Unit = {}) {
    if (involvedObject == null) {
        involvedObject = model_ObjectReference()
    }

    involvedObject.block()
}
