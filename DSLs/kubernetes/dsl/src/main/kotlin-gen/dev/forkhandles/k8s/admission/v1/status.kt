// GENERATED
package dev.forkhandles.k8s.admission.v1

import io.fabric8.kubernetes.api.model.Status as model_Status
import io.fabric8.kubernetes.api.model.admission.v1.AdmissionResponse as v1_AdmissionResponse

fun v1_AdmissionResponse.status(block: model_Status.() -> Unit = {}) {
    if (status == null) {
        status = model_Status()
    }

    status.block()
}
