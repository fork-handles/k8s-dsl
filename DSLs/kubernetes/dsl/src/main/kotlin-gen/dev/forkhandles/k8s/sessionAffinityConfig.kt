// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ServiceSpec as model_ServiceSpec
import io.fabric8.kubernetes.api.model.SessionAffinityConfig as model_SessionAffinityConfig

fun model_ServiceSpec.sessionAffinityConfig(block: model_SessionAffinityConfig.() -> Unit = {}) {
    if (sessionAffinityConfig == null) {
        sessionAffinityConfig = model_SessionAffinityConfig()
    }

    sessionAffinityConfig.block()
}
