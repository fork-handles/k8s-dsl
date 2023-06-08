// GENERATED
package dev.forkhandles.k8s.admission.v1beta1

import io.fabric8.kubernetes.api.model.GroupVersionResource as model_GroupVersionResource
import io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionRequest as v1beta1_AdmissionRequest

fun v1beta1_AdmissionRequest.resource(block: model_GroupVersionResource.() -> Unit = {}) {
    if (resource == null) {
        resource = model_GroupVersionResource()
    }

    resource.block()
}
