// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ContainerResourceMetricSource as v2beta2_ContainerResourceMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ContainerResourceMetricStatus as v2beta2_ContainerResourceMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricSpec as v2beta2_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricStatus as v2beta2_MetricStatus

fun v2beta2_MetricSpec.containerResource(block: v2beta2_ContainerResourceMetricSource.() -> Unit = {}) {
    if (containerResource == null) {
        containerResource = v2beta2_ContainerResourceMetricSource()
    }

    containerResource.block()
}

fun v2beta2_MetricStatus.containerResource(block: v2beta2_ContainerResourceMetricStatus.() -> Unit = {}) {
    if (containerResource == null) {
        containerResource = v2beta2_ContainerResourceMetricStatus()
    }

    containerResource.block()
}
