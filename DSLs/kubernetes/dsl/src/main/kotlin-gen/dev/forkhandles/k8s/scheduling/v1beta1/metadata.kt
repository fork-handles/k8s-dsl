// GENERATED
package dev.forkhandles.k8s.scheduling.v1beta1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.scheduling.v1beta1.PriorityClass as v1beta1_PriorityClass
import io.fabric8.kubernetes.api.model.scheduling.v1beta1.PriorityClassList as v1beta1_PriorityClassList

fun v1beta1_PriorityClass.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1beta1_PriorityClassList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
