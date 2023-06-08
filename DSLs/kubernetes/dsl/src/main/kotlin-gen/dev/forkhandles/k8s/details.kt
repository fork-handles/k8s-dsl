// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Status as model_Status
import io.fabric8.kubernetes.api.model.StatusDetails as model_StatusDetails

fun model_Status.details(block: model_StatusDetails.() -> Unit = {}) {
    if (details == null) {
        details = model_StatusDetails()
    }

    details.block()
}
