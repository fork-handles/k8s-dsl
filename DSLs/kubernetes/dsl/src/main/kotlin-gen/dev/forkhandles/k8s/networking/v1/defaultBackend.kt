// GENERATED
package dev.forkhandles.k8s.networking.v1

import io.fabric8.kubernetes.api.model.networking.v1.IngressBackend as v1_IngressBackend
import io.fabric8.kubernetes.api.model.networking.v1.IngressSpec as v1_IngressSpec

fun v1_IngressSpec.defaultBackend(block: v1_IngressBackend.() -> Unit = {}) {
    if (defaultBackend == null) {
        defaultBackend = v1_IngressBackend()
    }

    defaultBackend.block()
}
