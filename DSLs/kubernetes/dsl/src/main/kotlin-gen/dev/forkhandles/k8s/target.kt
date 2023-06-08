// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Binding as model_Binding
import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference

fun model_Binding.target(block: model_ObjectReference.() -> Unit = {}) {
    if (target == null) {
        target = model_ObjectReference()
    }

    target.block()
}
