// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1

import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicy as v1_ValidatingAdmissionPolicy
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBinding as v1_ValidatingAdmissionPolicyBinding
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBindingSpec as v1_ValidatingAdmissionPolicyBindingSpec
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicySpec as v1_ValidatingAdmissionPolicySpec

fun v1_ValidatingAdmissionPolicy.spec(block: v1_ValidatingAdmissionPolicySpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1_ValidatingAdmissionPolicySpec()
    }

    spec.block()
}

fun v1_ValidatingAdmissionPolicyBinding.spec(block: v1_ValidatingAdmissionPolicyBindingSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1_ValidatingAdmissionPolicyBindingSpec()
    }

    spec.block()
}
