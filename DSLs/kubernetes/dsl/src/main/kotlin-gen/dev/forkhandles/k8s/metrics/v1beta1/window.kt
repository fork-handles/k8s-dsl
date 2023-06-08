// GENERATED
package dev.forkhandles.k8s.metrics.v1beta1

import io.fabric8.kubernetes.api.model.Duration as model_Duration
import io.fabric8.kubernetes.api.model.metrics.v1beta1.NodeMetrics as v1beta1_NodeMetrics
import io.fabric8.kubernetes.api.model.metrics.v1beta1.PodMetrics as v1beta1_PodMetrics

fun v1beta1_NodeMetrics.window(block: model_Duration.() -> Unit = {}) {
    if (window == null) {
        window = model_Duration()
    }

    window.block()
}

fun v1beta1_PodMetrics.window(block: model_Duration.() -> Unit = {}) {
    if (window == null) {
        window = model_Duration()
    }

    window.block()
}
