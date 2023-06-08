// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PodDNSConfig as model_PodDNSConfig
import io.fabric8.kubernetes.api.model.PodSpec as model_PodSpec

fun model_PodSpec.dnsConfig(block: model_PodDNSConfig.() -> Unit = {}) {
    if (dnsConfig == null) {
        dnsConfig = model_PodDNSConfig()
    }

    dnsConfig.block()
}
