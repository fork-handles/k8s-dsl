// GENERATED
package dev.forkhandles.k8s.autoscaling.v2

import io.fabric8.kubernetes.api.model.autoscaling.v2.HPAScalingRules as v2_HPAScalingRules
import io.fabric8.kubernetes.api.model.autoscaling.v2.HorizontalPodAutoscalerBehavior as v2_HorizontalPodAutoscalerBehavior

fun v2_HorizontalPodAutoscalerBehavior.scaleUp(block: v2_HPAScalingRules.() -> Unit = {}) {
    if (scaleUp == null) {
        scaleUp = v2_HPAScalingRules()
    }

    scaleUp.block()
}
