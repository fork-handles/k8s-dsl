// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Container as model_Container
import io.fabric8.kubernetes.api.model.EphemeralContainer as model_EphemeralContainer
import io.fabric8.kubernetes.api.model.Probe as model_Probe

fun model_Container.readinessProbe(block: model_Probe.() -> Unit = {}) {
    if (readinessProbe == null) {
        readinessProbe = model_Probe()
    }

    readinessProbe.block()
}

fun model_EphemeralContainer.readinessProbe(block: model_Probe.() -> Unit = {}) {
    if (readinessProbe == null) {
        readinessProbe = model_Probe()
    }

    readinessProbe.block()
}
