// GENERATED
package dev.forkhandles.k8s.policy.v1

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudgetSpec as v1_PodDisruptionBudgetSpec

fun v1_PodDisruptionBudgetSpec.minAvailable(block: model_IntOrString.() -> Unit = {}) {
    if (minAvailable == null) {
        minAvailable = model_IntOrString()
    }

    minAvailable.block()
}
