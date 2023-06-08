// GENERATED
package dev.forkhandles.k8s.policy.v1beta1

import io.fabric8.kubernetes.api.model.policy.v1beta1.PodDisruptionBudget as v1beta1_PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.v1beta1.PodDisruptionBudgetSpec as v1beta1_PodDisruptionBudgetSpec
import io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicy as v1beta1_PodSecurityPolicy
import io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicySpec as v1beta1_PodSecurityPolicySpec

fun v1beta1_PodDisruptionBudget.spec(block: v1beta1_PodDisruptionBudgetSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1beta1_PodDisruptionBudgetSpec()
    }

    spec.block()
}

fun v1beta1_PodSecurityPolicy.spec(block: v1beta1_PodSecurityPolicySpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1beta1_PodSecurityPolicySpec()
    }

    spec.block()
}
