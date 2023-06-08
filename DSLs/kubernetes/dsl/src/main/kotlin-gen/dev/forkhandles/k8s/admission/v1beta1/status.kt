// GENERATED
package dev.forkhandles.k8s.admission.v1beta1

import io.fabric8.kubernetes.api.model.Status as model_Status
import io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionResponse as v1beta1_AdmissionResponse

fun v1beta1_AdmissionResponse.status(block: model_Status.() -> Unit = {}) {
    if (status == null) {
        status = model_Status()
    }

    status.block()
}
