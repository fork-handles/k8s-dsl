// GENERATED
package dev.forkhandles.k8s.autoscaling.v1

import io.fabric8.kubernetes.api.model.autoscaling.v1.HorizontalPodAutoscaler as v1_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v1.HorizontalPodAutoscalerSpec as v1_HorizontalPodAutoscalerSpec
import io.fabric8.kubernetes.api.model.autoscaling.v1.Scale as v1_Scale
import io.fabric8.kubernetes.api.model.autoscaling.v1.ScaleSpec as v1_ScaleSpec

fun v1_HorizontalPodAutoscaler.spec(block: v1_HorizontalPodAutoscalerSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1_HorizontalPodAutoscalerSpec()
    }

    spec.block()
}

fun v1_Scale.spec(block: v1_ScaleSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1_ScaleSpec()
    }

    spec.block()
}
