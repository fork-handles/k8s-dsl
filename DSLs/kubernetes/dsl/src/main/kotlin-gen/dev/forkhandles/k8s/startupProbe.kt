// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Container as model_Container
import io.fabric8.kubernetes.api.model.EphemeralContainer as model_EphemeralContainer
import io.fabric8.kubernetes.api.model.Probe as model_Probe

fun model_Container.startupProbe(block: model_Probe.() -> Unit = {}) {
    if (startupProbe == null) {
        startupProbe = model_Probe()
    }

    startupProbe.block()
}

fun model_EphemeralContainer.startupProbe(block: model_Probe.() -> Unit = {}) {
    if (startupProbe == null) {
        startupProbe = model_Probe()
    }

    startupProbe.block()
}
