// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer as extensions_NetworkPolicyPeer

fun extensions_NetworkPolicyPeer.namespaceSelector(block: model_LabelSelector.() -> Unit = {}) {
    if (namespaceSelector == null) {
        namespaceSelector = model_LabelSelector()
    }

    namespaceSelector.block()
}
