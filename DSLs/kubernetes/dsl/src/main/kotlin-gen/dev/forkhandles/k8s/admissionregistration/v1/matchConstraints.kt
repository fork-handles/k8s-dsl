// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1

import io.fabric8.kubernetes.api.model.admissionregistration.v1.MatchResources as v1_MatchResources
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicySpec as v1_ValidatingAdmissionPolicySpec

fun v1_ValidatingAdmissionPolicySpec.matchConstraints(block: v1_MatchResources.() -> Unit = {}) {
    if (matchConstraints == null) {
        matchConstraints = v1_MatchResources()
    }

    matchConstraints.block()
}
