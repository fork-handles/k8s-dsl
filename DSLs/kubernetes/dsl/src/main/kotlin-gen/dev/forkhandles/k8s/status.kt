// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.APIService as model_APIService
import io.fabric8.kubernetes.api.model.APIServiceStatus as model_APIServiceStatus
import io.fabric8.kubernetes.api.model.Namespace as model_Namespace
import io.fabric8.kubernetes.api.model.NamespaceStatus as model_NamespaceStatus
import io.fabric8.kubernetes.api.model.Node as model_Node
import io.fabric8.kubernetes.api.model.NodeStatus as model_NodeStatus
import io.fabric8.kubernetes.api.model.PersistentVolume as model_PersistentVolume
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim as model_PersistentVolumeClaim
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimStatus as model_PersistentVolumeClaimStatus
import io.fabric8.kubernetes.api.model.PersistentVolumeStatus as model_PersistentVolumeStatus
import io.fabric8.kubernetes.api.model.Pod as model_Pod
import io.fabric8.kubernetes.api.model.PodStatus as model_PodStatus
import io.fabric8.kubernetes.api.model.ReplicationController as model_ReplicationController
import io.fabric8.kubernetes.api.model.ReplicationControllerStatus as model_ReplicationControllerStatus
import io.fabric8.kubernetes.api.model.ResourceQuota as model_ResourceQuota
import io.fabric8.kubernetes.api.model.ResourceQuotaStatus as model_ResourceQuotaStatus
import io.fabric8.kubernetes.api.model.Service as model_Service
import io.fabric8.kubernetes.api.model.ServiceStatus as model_ServiceStatus

fun model_APIService.status(block: model_APIServiceStatus.() -> Unit = {}) {
    if (status == null) {
        status = model_APIServiceStatus()
    }

    status.block()
}

fun model_Namespace.status(block: model_NamespaceStatus.() -> Unit = {}) {
    if (status == null) {
        status = model_NamespaceStatus()
    }

    status.block()
}

fun model_Node.status(block: model_NodeStatus.() -> Unit = {}) {
    if (status == null) {
        status = model_NodeStatus()
    }

    status.block()
}

fun model_PersistentVolume.status(block: model_PersistentVolumeStatus.() -> Unit = {}) {
    if (status == null) {
        status = model_PersistentVolumeStatus()
    }

    status.block()
}

fun model_PersistentVolumeClaim.status(block: model_PersistentVolumeClaimStatus.() -> Unit = {}) {
    if (status == null) {
        status = model_PersistentVolumeClaimStatus()
    }

    status.block()
}

fun model_Pod.status(block: model_PodStatus.() -> Unit = {}) {
    if (status == null) {
        status = model_PodStatus()
    }

    status.block()
}

fun model_ReplicationController.status(block: model_ReplicationControllerStatus.() -> Unit = {}) {
    if (status == null) {
        status = model_ReplicationControllerStatus()
    }

    status.block()
}

fun model_ResourceQuota.status(block: model_ResourceQuotaStatus.() -> Unit = {}) {
    if (status == null) {
        status = model_ResourceQuotaStatus()
    }

    status.block()
}

fun model_Service.status(block: model_ServiceStatus.() -> Unit = {}) {
    if (status == null) {
        status = model_ServiceStatus()
    }

    status.block()
}
