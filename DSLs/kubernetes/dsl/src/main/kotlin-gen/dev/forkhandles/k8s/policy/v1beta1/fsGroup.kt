// GENERATED
package dev.forkhandles.k8s.policy.v1beta1

import io.fabric8.kubernetes.api.model.policy.v1beta1.FSGroupStrategyOptions as v1beta1_FSGroupStrategyOptions
import io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicySpec as v1beta1_PodSecurityPolicySpec

fun v1beta1_PodSecurityPolicySpec.fsGroup(block: v1beta1_FSGroupStrategyOptions.() -> Unit = {}) {
    if (fsGroup == null) {
        fsGroup = v1beta1_FSGroupStrategyOptions()
    }

    fsGroup.block()
}
