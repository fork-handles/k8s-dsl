// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Event as model_Event
import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference

fun model_Event.related(block: model_ObjectReference.() -> Unit = {}) {
    if (related == null) {
        related = model_ObjectReference()
    }

    related.block()
}
