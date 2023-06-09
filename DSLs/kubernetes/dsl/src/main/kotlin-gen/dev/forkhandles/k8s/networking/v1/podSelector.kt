// GENERATED
package dev.forkhandles.k8s.networking.v1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicyPeer as v1_NetworkPolicyPeer
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicySpec as v1_NetworkPolicySpec

fun v1_NetworkPolicyPeer.podSelector(block: model_LabelSelector.() -> Unit = {}) {
    if (podSelector == null) {
        podSelector = model_LabelSelector()
    }

    podSelector.block()
}

fun v1_NetworkPolicySpec.podSelector(block: model_LabelSelector.() -> Unit = {}) {
    if (podSelector == null) {
        podSelector = model_LabelSelector()
    }

    podSelector.block()
}
