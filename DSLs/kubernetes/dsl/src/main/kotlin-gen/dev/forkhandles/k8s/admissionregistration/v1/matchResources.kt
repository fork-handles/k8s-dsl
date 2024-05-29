// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1

import io.fabric8.kubernetes.api.model.admissionregistration.v1.MatchResources as v1_MatchResources
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBindingSpec as v1_ValidatingAdmissionPolicyBindingSpec

fun v1_ValidatingAdmissionPolicyBindingSpec.matchResources(block: v1_MatchResources.() -> Unit = {}) {
    if (matchResources == null) {
        matchResources = v1_MatchResources()
    }

    matchResources.block()
}
