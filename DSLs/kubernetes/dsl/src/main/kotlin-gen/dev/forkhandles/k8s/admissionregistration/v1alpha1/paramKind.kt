// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1alpha1

import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ParamKind as v1alpha1_ParamKind
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicySpec as v1alpha1_ValidatingAdmissionPolicySpec

fun v1alpha1_ValidatingAdmissionPolicySpec.paramKind(block: v1alpha1_ParamKind.() -> Unit = {}) {
    if (paramKind == null) {
        paramKind = v1alpha1_ParamKind()
    }

    paramKind.block()
}
