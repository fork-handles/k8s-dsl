// GENERATED
package dev.forkhandles.k8s.networking.v1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.networking.v1.Ingress as v1_Ingress
import io.fabric8.kubernetes.api.model.networking.v1.IngressClass as v1_IngressClass
import io.fabric8.kubernetes.api.model.networking.v1.IngressClassList as v1_IngressClassList
import io.fabric8.kubernetes.api.model.networking.v1.IngressList as v1_IngressList
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicy as v1_NetworkPolicy
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicyList as v1_NetworkPolicyList

fun v1_Ingress.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1_IngressClass.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1_IngressClassList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun v1_IngressList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun v1_NetworkPolicy.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1_NetworkPolicyList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
