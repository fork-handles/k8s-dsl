// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.IntOrString as model_IntOrString
import io.fabric8.kubernetes.api.model.ServicePort as model_ServicePort

fun model_ServicePort.targetPort(block: model_IntOrString.() -> Unit = {}) {
    if (targetPort == null) {
        targetPort = model_IntOrString()
    }

    targetPort.block()
}
