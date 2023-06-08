// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscaler as v2beta2_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.HorizontalPodAutoscalerList as v2beta2_HorizontalPodAutoscalerList

fun v2beta2_HorizontalPodAutoscaler.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v2beta2_HorizontalPodAutoscalerList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
