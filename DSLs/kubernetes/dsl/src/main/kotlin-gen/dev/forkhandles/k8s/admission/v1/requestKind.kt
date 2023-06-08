// GENERATED
package dev.forkhandles.k8s.admission.v1

import io.fabric8.kubernetes.api.model.GroupVersionKind as model_GroupVersionKind
import io.fabric8.kubernetes.api.model.admission.v1.AdmissionRequest as v1_AdmissionRequest

fun v1_AdmissionRequest.requestKind(block: model_GroupVersionKind.() -> Unit = {}) {
    if (requestKind == null) {
        requestKind = model_GroupVersionKind()
    }

    requestKind.block()
}
