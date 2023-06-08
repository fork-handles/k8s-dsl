// GENERATED
package dev.forkhandles.k8s.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinition as v1_CustomResourceDefinition
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionStatus as v1_CustomResourceDefinitionStatus
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceSubresourceStatus as v1_CustomResourceSubresourceStatus
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceSubresources as v1_CustomResourceSubresources

fun v1_CustomResourceDefinition.status(block: v1_CustomResourceDefinitionStatus.() -> Unit = {}) {
    if (status == null) {
        status = v1_CustomResourceDefinitionStatus()
    }

    status.block()
}

fun v1_CustomResourceSubresources.status(block: v1_CustomResourceSubresourceStatus.() -> Unit = {}) {
    if (status == null) {
        status = v1_CustomResourceSubresourceStatus()
    }

    status.block()
}
