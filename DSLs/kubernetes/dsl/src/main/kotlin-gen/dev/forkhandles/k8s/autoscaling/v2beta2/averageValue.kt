// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricTarget as v2beta2_MetricTarget
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricValueStatus as v2beta2_MetricValueStatus

fun v2beta2_MetricTarget.averageValue(block: model_Quantity.() -> Unit = {}) {
    if (averageValue == null) {
        averageValue = model_Quantity()
    }

    averageValue.block()
}

fun v2beta2_MetricValueStatus.averageValue(block: model_Quantity.() -> Unit = {}) {
    if (averageValue == null) {
        averageValue = model_Quantity()
    }

    averageValue.block()
}
