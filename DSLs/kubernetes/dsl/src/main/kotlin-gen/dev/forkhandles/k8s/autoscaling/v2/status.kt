// GENERATED
package dev.forkhandles.k8s.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscaler as v2_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscalerStatus as v2_HorizontalPodAutoscalerStatus

fun v2_HorizontalPodAutoscaler.status(block: v2_HorizontalPodAutoscalerStatus.() -> Unit = {}) {
    if (status == null) {
        status = v2_HorizontalPodAutoscalerStatus()
    }

    status.block()
}
