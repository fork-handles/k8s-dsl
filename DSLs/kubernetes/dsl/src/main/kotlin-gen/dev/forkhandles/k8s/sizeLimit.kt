// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.EmptyDirVolumeSource as model_EmptyDirVolumeSource
import io.fabric8.kubernetes.api.model.Quantity as model_Quantity

fun model_EmptyDirVolumeSource.sizeLimit(block: model_Quantity.() -> Unit = {}) {
    if (sizeLimit == null) {
        sizeLimit = model_Quantity()
    }

    sizeLimit.block()
}
