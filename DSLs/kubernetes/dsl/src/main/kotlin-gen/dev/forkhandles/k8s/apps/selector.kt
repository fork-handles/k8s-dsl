// GENERATED
package dev.forkhandles.k8s.apps

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.apps.DaemonSetSpec as apps_DaemonSetSpec
import io.fabric8.kubernetes.api.model.apps.DeploymentSpec as apps_DeploymentSpec
import io.fabric8.kubernetes.api.model.apps.ReplicaSetSpec as apps_ReplicaSetSpec
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec as apps_StatefulSetSpec

fun apps_DaemonSetSpec.selector(block: model_LabelSelector.() -> Unit = {}) {
    if (selector == null) {
        selector = model_LabelSelector()
    }

    selector.block()
}

fun apps_DeploymentSpec.selector(block: model_LabelSelector.() -> Unit = {}) {
    if (selector == null) {
        selector = model_LabelSelector()
    }

    selector.block()
}

fun apps_ReplicaSetSpec.selector(block: model_LabelSelector.() -> Unit = {}) {
    if (selector == null) {
        selector = model_LabelSelector()
    }

    selector.block()
}

fun apps_StatefulSetSpec.selector(block: model_LabelSelector.() -> Unit = {}) {
    if (selector == null) {
        selector = model_LabelSelector()
    }

    selector.block()
}
