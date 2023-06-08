// GENERATED
package dev.forkhandles.k8s.admission.v1beta1

import io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionResponse as v1beta1_AdmissionResponse
import io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionReview as v1beta1_AdmissionReview

fun v1beta1_AdmissionReview.response(block: v1beta1_AdmissionResponse.() -> Unit = {}) {
    if (response == null) {
        response = v1beta1_AdmissionResponse()
    }

    response.block()
}
