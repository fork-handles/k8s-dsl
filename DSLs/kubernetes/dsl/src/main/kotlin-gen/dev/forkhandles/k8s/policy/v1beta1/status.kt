// GENERATED
package dev.forkhandles.k8s.policy.v1beta1

import io.fabric8.kubernetes.api.model.policy.v1beta1.PodDisruptionBudget as v1beta1_PodDisruptionBudget
import io.fabric8.kubernetes.api.model.policy.v1beta1.PodDisruptionBudgetStatus as v1beta1_PodDisruptionBudgetStatus

fun v1beta1_PodDisruptionBudget.status(block: v1beta1_PodDisruptionBudgetStatus.() -> Unit = {}) {
    if (status == null) {
        status = v1beta1_PodDisruptionBudgetStatus()
    }

    status.block()
}
