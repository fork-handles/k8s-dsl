// GENERATED
package dev.forkhandles.k8s.policy.v1beta1

import io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicySpec as v1beta1_PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.policy.v1beta1.RuntimeClassStrategyOptions as v1beta1_RuntimeClassStrategyOptions

fun v1beta1_PodSecurityPolicySpec.runtimeClass(block: v1beta1_RuntimeClassStrategyOptions.() -> Unit = {}) {
    if (runtimeClass == null) {
        runtimeClass = v1beta1_RuntimeClassStrategyOptions()
    }

    runtimeClass.block()
}
