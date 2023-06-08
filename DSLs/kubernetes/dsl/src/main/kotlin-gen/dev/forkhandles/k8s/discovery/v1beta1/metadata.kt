// GENERATED
package dev.forkhandles.k8s.discovery.v1beta1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.discovery.v1beta1.EndpointSlice as v1beta1_EndpointSlice
import io.fabric8.kubernetes.api.model.discovery.v1beta1.EndpointSliceList as v1beta1_EndpointSliceList

fun v1beta1_EndpointSlice.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1beta1_EndpointSliceList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
