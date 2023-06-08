// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.MetricSpec as v2beta1_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.MetricStatus as v2beta1_MetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ObjectMetricSource as v2beta1_ObjectMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ObjectMetricStatus as v2beta1_ObjectMetricStatus

fun v2beta1_MetricSpec.`object`(block: v2beta1_ObjectMetricSource.() -> Unit = {}) {
    if (`object` == null) {
        `object` = v2beta1_ObjectMetricSource()
    }

    `object`.block()
}

fun v2beta1_MetricStatus.`object`(block: v2beta1_ObjectMetricStatus.() -> Unit = {}) {
    if (`object` == null) {
        `object` = v2beta1_ObjectMetricStatus()
    }

    `object`.block()
}
