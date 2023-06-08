// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.HorizontalPodAutoscaler as v2beta1_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.HorizontalPodAutoscalerList as v2beta1_HorizontalPodAutoscalerList

fun v2beta1_HorizontalPodAutoscaler.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v2beta1_HorizontalPodAutoscalerList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
