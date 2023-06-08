// GENERATED
package dev.forkhandles.k8s.networking.v1

import io.fabric8.kubernetes.api.model.networking.v1.HTTPIngressPath as v1_HTTPIngressPath
import io.fabric8.kubernetes.api.model.networking.v1.IngressBackend as v1_IngressBackend

fun v1_HTTPIngressPath.backend(block: v1_IngressBackend.() -> Unit = {}) {
    if (backend == null) {
        backend = v1_IngressBackend()
    }

    backend.block()
}
