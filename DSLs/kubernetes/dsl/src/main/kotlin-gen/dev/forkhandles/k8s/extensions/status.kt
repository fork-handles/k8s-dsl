// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.extensions.DaemonSet as extensions_DaemonSet
import io.fabric8.kubernetes.api.model.extensions.DaemonSetStatus as extensions_DaemonSetStatus
import io.fabric8.kubernetes.api.model.extensions.Deployment as extensions_Deployment
import io.fabric8.kubernetes.api.model.extensions.DeploymentStatus as extensions_DeploymentStatus
import io.fabric8.kubernetes.api.model.extensions.Ingress as extensions_Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressStatus as extensions_IngressStatus
import io.fabric8.kubernetes.api.model.extensions.ReplicaSet as extensions_ReplicaSet
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetStatus as extensions_ReplicaSetStatus

fun extensions_DaemonSet.status(block: extensions_DaemonSetStatus.() -> Unit = {}) {
    if (status == null) {
        status = extensions_DaemonSetStatus()
    }

    status.block()
}

fun extensions_Deployment.status(block: extensions_DeploymentStatus.() -> Unit = {}) {
    if (status == null) {
        status = extensions_DeploymentStatus()
    }

    status.block()
}

fun extensions_Ingress.status(block: extensions_IngressStatus.() -> Unit = {}) {
    if (status == null) {
        status = extensions_IngressStatus()
    }

    status.block()
}

fun extensions_ReplicaSet.status(block: extensions_ReplicaSetStatus.() -> Unit = {}) {
    if (status == null) {
        status = extensions_ReplicaSetStatus()
    }

    status.block()
}
