// GENERATED
package dev.forkhandles.k8s.networking.v1

import io.fabric8.kubernetes.api.model.networking.v1.Ingress as v1_Ingress
import io.fabric8.kubernetes.api.model.networking.v1.IngressStatus as v1_IngressStatus

fun v1_Ingress.status(block: v1_IngressStatus.() -> Unit = {}) {
    if (status == null) {
        status = v1_IngressStatus()
    }

    status.block()
}
