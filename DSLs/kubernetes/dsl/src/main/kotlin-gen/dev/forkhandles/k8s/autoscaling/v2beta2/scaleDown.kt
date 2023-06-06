// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HPAScalingRules as v2beta2_HPAScalingRules
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscalerBehavior as v2beta2_HorizontalPodAutoscalerBehavior


fun v2beta2_HorizontalPodAutoscalerBehavior.`scaleDown`(block: v2beta2_HPAScalingRules.() -> Unit = {}) {
    if (this.`scaleDown` == null) {
        this.`scaleDown` = v2beta2_HPAScalingRules()
    }

    this.`scaleDown`.block()
}

