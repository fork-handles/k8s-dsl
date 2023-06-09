// GENERATED
package dev.forkhandles.k8s.policy.v1beta1

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.policy.v1beta1.PodDisruptionBudgetSpec as v1beta1_PodDisruptionBudgetSpec

fun v1beta1_PodDisruptionBudgetSpec.maxUnavailable(block: model_IntOrString.() -> Unit = {}) {
    if (maxUnavailable == null) {
        maxUnavailable = model_IntOrString()
    }

    maxUnavailable.block()
}
