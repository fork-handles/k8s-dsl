// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1beta1

import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.TypeChecking as v1beta1_TypeChecking
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyStatus as v1beta1_ValidatingAdmissionPolicyStatus

fun v1beta1_ValidatingAdmissionPolicyStatus.typeChecking(block: v1beta1_TypeChecking.() -> Unit = {}) {
    if (typeChecking == null) {
        typeChecking = v1beta1_TypeChecking()
    }

    typeChecking.block()
}
