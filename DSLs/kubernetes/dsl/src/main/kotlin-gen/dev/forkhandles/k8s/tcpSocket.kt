// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.LifecycleHandler as model_LifecycleHandler
import io.fabric8.kubernetes.api.model.Probe as model_Probe
import io.fabric8.kubernetes.api.model.TCPSocketAction as model_TCPSocketAction

fun model_LifecycleHandler.tcpSocket(block: model_TCPSocketAction.() -> Unit = {}) {
    if (tcpSocket == null) {
        tcpSocket = model_TCPSocketAction()
    }

    tcpSocket.block()
}

fun model_Probe.tcpSocket(block: model_TCPSocketAction.() -> Unit = {}) {
    if (tcpSocket == null) {
        tcpSocket = model_TCPSocketAction()
    }

    tcpSocket.block()
}
