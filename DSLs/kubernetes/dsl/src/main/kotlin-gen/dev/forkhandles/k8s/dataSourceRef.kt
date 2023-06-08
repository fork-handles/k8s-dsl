// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec as model_PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.TypedObjectReference as model_TypedObjectReference

fun model_PersistentVolumeClaimSpec.dataSourceRef(block: model_TypedObjectReference.() -> Unit = {}) {
    if (dataSourceRef == null) {
        dataSourceRef = model_TypedObjectReference()
    }

    dataSourceRef.block()
}
