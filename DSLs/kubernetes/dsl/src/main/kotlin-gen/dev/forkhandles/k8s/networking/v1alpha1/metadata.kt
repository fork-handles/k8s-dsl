// GENERATED
package dev.forkhandles.k8s.networking.v1alpha1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ClusterCIDR as v1alpha1_ClusterCIDR
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ClusterCIDRList as v1alpha1_ClusterCIDRList
import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddress as v1alpha1_IPAddress
import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddressList as v1alpha1_IPAddressList

fun v1alpha1_ClusterCIDR.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1alpha1_ClusterCIDRList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun v1alpha1_IPAddress.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1alpha1_IPAddressList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
