// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1beta1

import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ParamKind as v1beta1_ParamKind
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec as v1beta1_ValidatingAdmissionPolicySpec

fun v1beta1_ValidatingAdmissionPolicySpec.paramKind(block: v1beta1_ParamKind.() -> Unit = {}) {
    if (paramKind == null) {
        paramKind = v1beta1_ParamKind()
    }

    paramKind.block()
}
