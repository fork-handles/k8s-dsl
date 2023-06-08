// GENERATED
package dev.forkhandles.k8s.apps

import io.fabric8.kubernetes.api.model.apps.DaemonSet as apps_DaemonSet
import io.fabric8.kubernetes.api.model.apps.DaemonSetStatus as apps_DaemonSetStatus
import io.fabric8.kubernetes.api.model.apps.Deployment as apps_Deployment
import io.fabric8.kubernetes.api.model.apps.DeploymentStatus as apps_DeploymentStatus
import io.fabric8.kubernetes.api.model.apps.ReplicaSet as apps_ReplicaSet
import io.fabric8.kubernetes.api.model.apps.ReplicaSetStatus as apps_ReplicaSetStatus
import io.fabric8.kubernetes.api.model.apps.StatefulSet as apps_StatefulSet
import io.fabric8.kubernetes.api.model.apps.StatefulSetStatus as apps_StatefulSetStatus

fun apps_DaemonSet.status(block: apps_DaemonSetStatus.() -> Unit = {}) {
    if (status == null) {
        status = apps_DaemonSetStatus()
    }

    status.block()
}

fun apps_Deployment.status(block: apps_DeploymentStatus.() -> Unit = {}) {
    if (status == null) {
        status = apps_DeploymentStatus()
    }

    status.block()
}

fun apps_ReplicaSet.status(block: apps_ReplicaSetStatus.() -> Unit = {}) {
    if (status == null) {
        status = apps_ReplicaSetStatus()
    }

    status.block()
}

fun apps_StatefulSet.status(block: apps_StatefulSetStatus.() -> Unit = {}) {
    if (status == null) {
        status = apps_StatefulSetStatus()
    }

    status.block()
}
