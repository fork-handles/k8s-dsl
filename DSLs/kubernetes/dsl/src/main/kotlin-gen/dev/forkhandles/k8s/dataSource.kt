// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec as model_PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.TypedLocalObjectReference as model_TypedLocalObjectReference

fun model_PersistentVolumeClaimSpec.dataSource(block: model_TypedLocalObjectReference.() -> Unit = {}) {
    if (dataSource == null) {
        dataSource = model_TypedLocalObjectReference()
    }

    dataSource.block()
}
