// GENERATED
package dev.forkhandles.k8s.policy.v1beta1

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.policy.v1beta1.PodDisruptionBudgetSpec as v1beta1_PodDisruptionBudgetSpec

fun v1beta1_PodDisruptionBudgetSpec.minAvailable(block: model_IntOrString.() -> Unit = {}) {
    if (minAvailable == null) {
        minAvailable = model_IntOrString()
    }

    minAvailable.block()
}
