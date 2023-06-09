// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.MetricIdentifier as v2beta2_MetricIdentifier

fun v2beta2_MetricIdentifier.selector(block: model_LabelSelector.() -> Unit = {}) {
    if (selector == null) {
        selector = model_LabelSelector()
    }

    selector.block()
}
