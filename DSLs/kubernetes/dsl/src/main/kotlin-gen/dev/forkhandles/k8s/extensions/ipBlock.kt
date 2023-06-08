// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.extensions.IPBlock as extensions_IPBlock
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer as extensions_NetworkPolicyPeer

fun extensions_NetworkPolicyPeer.ipBlock(block: extensions_IPBlock.() -> Unit = {}) {
    if (ipBlock == null) {
        ipBlock = extensions_IPBlock()
    }

    ipBlock.block()
}
