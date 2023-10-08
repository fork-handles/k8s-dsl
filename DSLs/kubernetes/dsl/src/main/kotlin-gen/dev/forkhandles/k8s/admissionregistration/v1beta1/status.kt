// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1beta1

import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicy as v1beta1_ValidatingAdmissionPolicy
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyStatus as v1beta1_ValidatingAdmissionPolicyStatus

fun v1beta1_ValidatingAdmissionPolicy.status(block: v1beta1_ValidatingAdmissionPolicyStatus.() -> Unit = {}) {
    if (status == null) {
        status = v1beta1_ValidatingAdmissionPolicyStatus()
    }

    status.block()
}
