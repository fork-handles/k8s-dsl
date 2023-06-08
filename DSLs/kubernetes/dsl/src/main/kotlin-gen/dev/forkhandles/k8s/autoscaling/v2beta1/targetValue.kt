// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ExternalMetricSource as v2beta1_ExternalMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ObjectMetricSource as v2beta1_ObjectMetricSource

fun v2beta1_ExternalMetricSource.targetValue(block: model_Quantity.() -> Unit = {}) {
    if (targetValue == null) {
        targetValue = model_Quantity()
    }

    targetValue.block()
}

fun v2beta1_ObjectMetricSource.targetValue(block: model_Quantity.() -> Unit = {}) {
    if (targetValue == null) {
        targetValue = model_Quantity()
    }

    targetValue.block()
}
