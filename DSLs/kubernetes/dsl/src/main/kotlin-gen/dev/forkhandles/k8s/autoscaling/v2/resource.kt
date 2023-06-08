// GENERATED
package dev.forkhandles.k8s.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricSpec as v2_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricStatus as v2_MetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.ResourceMetricSource as v2_ResourceMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.ResourceMetricStatus as v2_ResourceMetricStatus

fun v2_MetricSpec.resource(block: v2_ResourceMetricSource.() -> Unit = {}) {
    if (resource == null) {
        resource = v2_ResourceMetricSource()
    }

    resource.block()
}

fun v2_MetricStatus.resource(block: v2_ResourceMetricStatus.() -> Unit = {}) {
    if (resource == null) {
        resource = v2_ResourceMetricStatus()
    }

    resource.block()
}
