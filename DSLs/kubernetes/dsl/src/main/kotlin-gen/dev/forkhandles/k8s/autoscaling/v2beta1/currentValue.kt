// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ExternalMetricStatus as v2beta1_ExternalMetricStatus
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ObjectMetricStatus as v2beta1_ObjectMetricStatus

fun v2beta1_ExternalMetricStatus.currentValue(block: model_Quantity.() -> Unit = {}) {
    if (currentValue == null) {
        currentValue = model_Quantity()
    }

    currentValue.block()
}

fun v2beta1_ObjectMetricStatus.currentValue(block: model_Quantity.() -> Unit = {}) {
    if (currentValue == null) {
        currentValue = model_Quantity()
    }

    currentValue.block()
}
