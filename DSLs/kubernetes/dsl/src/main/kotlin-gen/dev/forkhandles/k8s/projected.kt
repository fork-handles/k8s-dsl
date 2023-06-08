// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ProjectedVolumeSource as model_ProjectedVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_Volume.projected(block: model_ProjectedVolumeSource.() -> Unit = {}) {
    if (projected == null) {
        projected = model_ProjectedVolumeSource()
    }

    projected.block()
}
