// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1alpha1

import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.MatchResources as v1alpha1_MatchResources
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBindingSpec as v1alpha1_ValidatingAdmissionPolicyBindingSpec

fun v1alpha1_ValidatingAdmissionPolicyBindingSpec.matchResources(block: v1alpha1_MatchResources.() -> Unit = {}) {
    if (matchResources == null) {
        matchResources = v1alpha1_MatchResources()
    }

    matchResources.block()
}
