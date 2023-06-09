// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ObjectMetricSource as v2beta1_ObjectMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ObjectMetricStatus as v2beta1_ObjectMetricStatus

fun v2beta1_ObjectMetricSource.averageValue(block: model_Quantity.() -> Unit = {}) {
    if (averageValue == null) {
        averageValue = model_Quantity()
    }

    averageValue.block()
}

fun v2beta1_ObjectMetricStatus.averageValue(block: model_Quantity.() -> Unit = {}) {
    if (averageValue == null) {
        averageValue = model_Quantity()
    }

    averageValue.block()
}
