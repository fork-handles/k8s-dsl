// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.GRPCAction as model_GRPCAction
import io.fabric8.kubernetes.api.model.Probe as model_Probe

fun model_Probe.grpc(block: model_GRPCAction.() -> Unit = {}) {
    if (grpc == null) {
        grpc = model_GRPCAction()
    }

    grpc.block()
}
