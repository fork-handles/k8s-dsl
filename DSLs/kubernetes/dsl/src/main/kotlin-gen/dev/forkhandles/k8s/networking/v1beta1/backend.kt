// GENERATED
package dev.forkhandles.k8s.networking.v1beta1

import io.fabric8.kubernetes.api.model.networking.v1beta1.HTTPIngressPath as v1beta1_HTTPIngressPath
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressBackend as v1beta1_IngressBackend
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressSpec as v1beta1_IngressSpec

fun v1beta1_HTTPIngressPath.backend(block: v1beta1_IngressBackend.() -> Unit = {}) {
    if (backend == null) {
        backend = v1beta1_IngressBackend()
    }

    backend.block()
}

fun v1beta1_IngressSpec.backend(block: v1beta1_IngressBackend.() -> Unit = {}) {
    if (backend == null) {
        backend = v1beta1_IngressBackend()
    }

    backend.block()
}
