// GENERATED
package dev.forkhandles.k8s.events.v1beta1

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.kubernetes.api.model.events.v1beta1.Event as v1beta1_Event

fun v1beta1_Event.regarding(block: model_ObjectReference.() -> Unit = {}) {
    if (regarding == null) {
        regarding = model_ObjectReference()
    }

    regarding.block()
}
