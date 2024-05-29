// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1

import io.fabric8.kubernetes.api.model.admissionregistration.v1.ParamRef as v1_ParamRef
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBindingSpec as v1_ValidatingAdmissionPolicyBindingSpec

fun v1_ValidatingAdmissionPolicyBindingSpec.paramRef(block: v1_ParamRef.() -> Unit = {}) {
    if (paramRef == null) {
        paramRef = v1_ParamRef()
    }

    paramRef.block()
}
