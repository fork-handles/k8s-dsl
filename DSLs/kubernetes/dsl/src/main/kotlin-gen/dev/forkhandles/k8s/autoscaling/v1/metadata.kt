// GENERATED
package dev.forkhandles.k8s.autoscaling.v1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.autoscaling.v1.HorizontalPodAutoscaler as v1_HorizontalPodAutoscaler
import io.fabric8.kubernetes.api.model.autoscaling.v1.HorizontalPodAutoscalerList as v1_HorizontalPodAutoscalerList
import io.fabric8.kubernetes.api.model.autoscaling.v1.Scale as v1_Scale

fun v1_HorizontalPodAutoscaler.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1_HorizontalPodAutoscalerList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun v1_Scale.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}
