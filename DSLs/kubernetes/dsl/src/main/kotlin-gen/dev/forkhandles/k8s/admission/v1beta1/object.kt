// GENERATED
package dev.forkhandles.k8s.admission.v1beta1

import io.fabric8.kubernetes.api.model.KubernetesResource as model_KubernetesResource
import io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionRequest as v1beta1_AdmissionRequest


fun v1beta1_AdmissionRequest.`object`(block: model_KubernetesResource.() -> Unit = {}) {
    this.`object`!!.block()
}

