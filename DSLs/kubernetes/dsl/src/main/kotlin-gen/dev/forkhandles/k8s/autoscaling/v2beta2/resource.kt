// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricSpec as v2beta2_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricStatus as v2beta2_MetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ResourceMetricSource as v2beta2_ResourceMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ResourceMetricStatus as v2beta2_ResourceMetricStatus

fun v2beta2_MetricSpec.resource(block: v2beta2_ResourceMetricSource.() -> Unit = {}) {
    if (resource == null) {
        resource = v2beta2_ResourceMetricSource()
    }

    resource.block()
}

fun v2beta2_MetricStatus.resource(block: v2beta2_ResourceMetricStatus.() -> Unit = {}) {
    if (resource == null) {
        resource = v2beta2_ResourceMetricStatus()
    }

    resource.block()
}
