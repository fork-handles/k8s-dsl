// GENERATED
package dev.forkhandles.k8s.discovery.v1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.discovery.v1.EndpointSlice as v1_EndpointSlice
import io.fabric8.kubernetes.api.model.discovery.v1.EndpointSliceList as v1_EndpointSliceList

fun v1_EndpointSlice.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1_EndpointSliceList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
