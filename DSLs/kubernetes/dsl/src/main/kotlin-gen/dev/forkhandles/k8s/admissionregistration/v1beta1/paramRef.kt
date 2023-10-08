// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1beta1

import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ParamRef as v1beta1_ParamRef
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBindingSpec as v1beta1_ValidatingAdmissionPolicyBindingSpec

fun v1beta1_ValidatingAdmissionPolicyBindingSpec.paramRef(block: v1beta1_ParamRef.() -> Unit = {}) {
    if (paramRef == null) {
        paramRef = v1beta1_ParamRef()
    }

    paramRef.block()
}
