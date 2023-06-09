// GENERATED
package dev.forkhandles.k8s.policy.v1

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudgetSpec as v1_PodDisruptionBudgetSpec

fun v1_PodDisruptionBudgetSpec.maxUnavailable(block: model_IntOrString.() -> Unit = {}) {
    if (maxUnavailable == null) {
        maxUnavailable = model_IntOrString()
    }

    maxUnavailable.block()
}
