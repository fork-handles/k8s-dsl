// GENERATED
package dev.forkhandles.k8s.apps

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.apps.ControllerRevision as apps_ControllerRevision
import io.fabric8.kubernetes.api.model.apps.ControllerRevisionList as apps_ControllerRevisionList
import io.fabric8.kubernetes.api.model.apps.DaemonSet as apps_DaemonSet
import io.fabric8.kubernetes.api.model.apps.DaemonSetList as apps_DaemonSetList
import io.fabric8.kubernetes.api.model.apps.Deployment as apps_Deployment
import io.fabric8.kubernetes.api.model.apps.DeploymentList as apps_DeploymentList
import io.fabric8.kubernetes.api.model.apps.ReplicaSet as apps_ReplicaSet
import io.fabric8.kubernetes.api.model.apps.ReplicaSetList as apps_ReplicaSetList
import io.fabric8.kubernetes.api.model.apps.StatefulSet as apps_StatefulSet
import io.fabric8.kubernetes.api.model.apps.StatefulSetList as apps_StatefulSetList

fun apps_ControllerRevision.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun apps_ControllerRevisionList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun apps_DaemonSet.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun apps_DaemonSetList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun apps_Deployment.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun apps_DeploymentList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun apps_ReplicaSet.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun apps_ReplicaSetList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun apps_StatefulSet.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun apps_StatefulSetList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
