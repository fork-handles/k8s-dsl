// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.APIService as model_APIService
import io.fabric8.kubernetes.api.model.APIServiceSpec as model_APIServiceSpec
import io.fabric8.kubernetes.api.model.LimitRange as model_LimitRange
import io.fabric8.kubernetes.api.model.LimitRangeSpec as model_LimitRangeSpec
import io.fabric8.kubernetes.api.model.Namespace as model_Namespace
import io.fabric8.kubernetes.api.model.NamespaceSpec as model_NamespaceSpec
import io.fabric8.kubernetes.api.model.Node as model_Node
import io.fabric8.kubernetes.api.model.NodeSpec as model_NodeSpec
import io.fabric8.kubernetes.api.model.PersistentVolume as model_PersistentVolume
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim as model_PersistentVolumeClaim
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec as model_PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimTemplate as model_PersistentVolumeClaimTemplate
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Pod as model_Pod
import io.fabric8.kubernetes.api.model.PodSpec as model_PodSpec
import io.fabric8.kubernetes.api.model.PodTemplateSpec as model_PodTemplateSpec
import io.fabric8.kubernetes.api.model.ReplicationController as model_ReplicationController
import io.fabric8.kubernetes.api.model.ReplicationControllerSpec as model_ReplicationControllerSpec
import io.fabric8.kubernetes.api.model.ResourceQuota as model_ResourceQuota
import io.fabric8.kubernetes.api.model.ResourceQuotaSpec as model_ResourceQuotaSpec
import io.fabric8.kubernetes.api.model.Service as model_Service
import io.fabric8.kubernetes.api.model.ServiceSpec as model_ServiceSpec

fun model_APIService.spec(block: model_APIServiceSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = model_APIServiceSpec()
    }

    spec.block()
}

fun model_LimitRange.spec(block: model_LimitRangeSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = model_LimitRangeSpec()
    }

    spec.block()
}

fun model_Namespace.spec(block: model_NamespaceSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = model_NamespaceSpec()
    }

    spec.block()
}

fun model_Node.spec(block: model_NodeSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = model_NodeSpec()
    }

    spec.block()
}

fun model_PersistentVolume.spec(block: model_PersistentVolumeSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = model_PersistentVolumeSpec()
    }

    spec.block()
}

fun model_PersistentVolumeClaim.spec(block: model_PersistentVolumeClaimSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = model_PersistentVolumeClaimSpec()
    }

    spec.block()
}

fun model_PersistentVolumeClaimTemplate.spec(block: model_PersistentVolumeClaimSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = model_PersistentVolumeClaimSpec()
    }

    spec.block()
}

fun model_Pod.spec(block: model_PodSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = model_PodSpec()
    }

    spec.block()
}

fun model_PodTemplateSpec.spec(block: model_PodSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = model_PodSpec()
    }

    spec.block()
}

fun model_ReplicationController.spec(block: model_ReplicationControllerSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = model_ReplicationControllerSpec()
    }

    spec.block()
}

fun model_ResourceQuota.spec(block: model_ResourceQuotaSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = model_ResourceQuotaSpec()
    }

    spec.block()
}

fun model_Service.spec(block: model_ServiceSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = model_ServiceSpec()
    }

    spec.block()
}
