// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1alpha1

import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.MatchResources as v1alpha1_MatchResources
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicySpec as v1alpha1_ValidatingAdmissionPolicySpec

fun v1alpha1_ValidatingAdmissionPolicySpec.matchConstraints(block: v1alpha1_MatchResources.() -> Unit = {}) {
    if (matchConstraints == null) {
        matchConstraints = v1alpha1_MatchResources()
    }

    matchConstraints.block()
}
