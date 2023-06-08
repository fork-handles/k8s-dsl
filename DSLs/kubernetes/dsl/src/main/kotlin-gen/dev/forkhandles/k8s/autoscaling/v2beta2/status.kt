// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscaler as v2beta2_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscalerStatus as v2beta2_HorizontalPodAutoscalerStatus

fun v2beta2_HorizontalPodAutoscaler.status(block: v2beta2_HorizontalPodAutoscalerStatus.() -> Unit = {}) {
    if (status == null) {
        status = v2beta2_HorizontalPodAutoscalerStatus()
    }

    status.block()
}
