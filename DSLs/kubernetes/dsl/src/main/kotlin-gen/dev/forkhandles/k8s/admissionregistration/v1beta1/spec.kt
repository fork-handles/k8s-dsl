// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1beta1

import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicy as v1beta1_ValidatingAdmissionPolicy
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBinding as v1beta1_ValidatingAdmissionPolicyBinding
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBindingSpec as v1beta1_ValidatingAdmissionPolicyBindingSpec
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec as v1beta1_ValidatingAdmissionPolicySpec

fun v1beta1_ValidatingAdmissionPolicy.spec(block: v1beta1_ValidatingAdmissionPolicySpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1beta1_ValidatingAdmissionPolicySpec()
    }

    spec.block()
}

fun v1beta1_ValidatingAdmissionPolicyBinding.spec(block: v1beta1_ValidatingAdmissionPolicyBindingSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1beta1_ValidatingAdmissionPolicyBindingSpec()
    }

    spec.block()
}
