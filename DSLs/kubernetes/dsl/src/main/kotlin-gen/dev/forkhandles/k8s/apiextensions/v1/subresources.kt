// GENERATED
package dev.forkhandles.k8s.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionVersion as v1_CustomResourceDefinitionVersion
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceSubresources as v1_CustomResourceSubresources

fun v1_CustomResourceDefinitionVersion.subresources(block: v1_CustomResourceSubresources.() -> Unit = {}) {
    if (subresources == null) {
        subresources = v1_CustomResourceSubresources()
    }

    subresources.block()
}
