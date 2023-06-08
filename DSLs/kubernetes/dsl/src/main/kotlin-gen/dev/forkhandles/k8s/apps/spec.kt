// GENERATED
package dev.forkhandles.k8s.apps

import io.fabric8.kubernetes.api.model.apps.DaemonSet as apps_DaemonSet
import io.fabric8.kubernetes.api.model.apps.DaemonSetSpec as apps_DaemonSetSpec
import io.fabric8.kubernetes.api.model.apps.Deployment as apps_Deployment
import io.fabric8.kubernetes.api.model.apps.DeploymentSpec as apps_DeploymentSpec
import io.fabric8.kubernetes.api.model.apps.ReplicaSet as apps_ReplicaSet
import io.fabric8.kubernetes.api.model.apps.ReplicaSetSpec as apps_ReplicaSetSpec
import io.fabric8.kubernetes.api.model.apps.StatefulSet as apps_StatefulSet
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec as apps_StatefulSetSpec

fun apps_DaemonSet.spec(block: apps_DaemonSetSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = apps_DaemonSetSpec()
    }

    spec.block()
}

fun apps_Deployment.spec(block: apps_DeploymentSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = apps_DeploymentSpec()
    }

    spec.block()
}

fun apps_ReplicaSet.spec(block: apps_ReplicaSetSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = apps_ReplicaSetSpec()
    }

    spec.block()
}

fun apps_StatefulSet.spec(block: apps_StatefulSetSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = apps_StatefulSetSpec()
    }

    spec.block()
}
