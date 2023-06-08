// GENERATED
package dev.forkhandles.k8s.rbac

import io.fabric8.kubernetes.api.model.rbac.AggregationRule as rbac_AggregationRule
import io.fabric8.kubernetes.api.model.rbac.ClusterRole as rbac_ClusterRole

fun rbac_ClusterRole.aggregationRule(block: rbac_AggregationRule.() -> Unit = {}) {
    if (aggregationRule == null) {
        aggregationRule = rbac_AggregationRule()
    }

    aggregationRule.block()
}
