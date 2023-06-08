// GENERATED
package dev.forkhandles.k8s.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricSpec as v2_MetricSpec
import io.fabric8.kubernetes.api.model.autoscaling.v2.MetricStatus as v2_MetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2.PodsMetricSource as v2_PodsMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2.PodsMetricStatus as v2_PodsMetricStatus

fun v2_MetricSpec.pods(block: v2_PodsMetricSource.() -> Unit = {}) {
    if (pods == null) {
        pods = v2_PodsMetricSource()
    }

    pods.block()
}

fun v2_MetricStatus.pods(block: v2_PodsMetricStatus.() -> Unit = {}) {
    if (pods == null) {
        pods = v2_PodsMetricStatus()
    }

    pods.block()
}
