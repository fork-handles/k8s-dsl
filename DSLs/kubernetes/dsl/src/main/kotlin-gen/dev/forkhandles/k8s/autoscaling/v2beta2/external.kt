// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ExternalMetricSource as v2beta2_ExternalMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ExternalMetricStatus as v2beta2_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricSpec as v2beta2_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricStatus as v2beta2_MetricStatus

fun v2beta2_MetricSpec.external(block: v2beta2_ExternalMetricSource.() -> Unit = {}) {
    if (external == null) {
        external = v2beta2_ExternalMetricSource()
    }

    external.block()
}

fun v2beta2_MetricStatus.external(block: v2beta2_ExternalMetricStatus.() -> Unit = {}) {
    if (external == null) {
        external = v2beta2_ExternalMetricStatus()
    }

    external.block()
}
