// GENERATED
package dev.forkhandles.k8s.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionNames as v1_CustomResourceDefinitionNames
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionStatus as v1_CustomResourceDefinitionStatus

fun v1_CustomResourceDefinitionStatus.acceptedNames(block: v1_CustomResourceDefinitionNames.() -> Unit = {}) {
    if (acceptedNames == null) {
        acceptedNames = v1_CustomResourceDefinitionNames()
    }

    acceptedNames.block()
}
