// GENERATED
package dev.forkhandles.k8s.scheduling.v1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.scheduling.v1.PriorityClass as v1_PriorityClass
import io.fabric8.kubernetes.api.model.scheduling.v1.PriorityClassList as v1_PriorityClassList

fun v1_PriorityClass.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1_PriorityClassList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
