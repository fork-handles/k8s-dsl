// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ClientIPConfig as model_ClientIPConfig
import io.fabric8.kubernetes.api.model.SessionAffinityConfig as model_SessionAffinityConfig

fun model_SessionAffinityConfig.clientIP(block: model_ClientIPConfig.() -> Unit = {}) {
    if (clientIP == null) {
        clientIP = model_ClientIPConfig()
    }

    clientIP.block()
}
