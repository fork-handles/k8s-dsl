// GENERATED
package dev.forkhandles.k8s.policy.v1

import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudget as v1_PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudgetSpec as v1_PodDisruptionBudgetSpec

fun v1_PodDisruptionBudget.spec(block: v1_PodDisruptionBudgetSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1_PodDisruptionBudgetSpec()
    }

    spec.block()
}
