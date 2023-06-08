// GENERATED
package dev.forkhandles.k8s.networking.v1

import io.fabric8.kubernetes.api.model.networking.v1.IPBlock as v1_IPBlock
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicyPeer as v1_NetworkPolicyPeer

fun v1_NetworkPolicyPeer.ipBlock(block: v1_IPBlock.() -> Unit = {}) {
    if (ipBlock == null) {
        ipBlock = v1_IPBlock()
    }

    ipBlock.block()
}
