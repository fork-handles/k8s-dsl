// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ObjectReference as model_ObjectReference
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec

fun model_PersistentVolumeSpec.claimRef(block: model_ObjectReference.() -> Unit = {}) {
    if (claimRef == null) {
        claimRef = model_ObjectReference()
    }

    claimRef.block()
}
