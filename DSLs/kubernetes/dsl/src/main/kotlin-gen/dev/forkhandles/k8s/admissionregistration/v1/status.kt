// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1

import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicy as v1_ValidatingAdmissionPolicy
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyStatus as v1_ValidatingAdmissionPolicyStatus

fun v1_ValidatingAdmissionPolicy.status(block: v1_ValidatingAdmissionPolicyStatus.() -> Unit = {}) {
    if (status == null) {
        status = v1_ValidatingAdmissionPolicyStatus()
    }

    status.block()
}
