// GENERATED
package dev.forkhandles.k8s.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionNames as v1beta1_CustomResourceDefinitionNames
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionStatus as v1beta1_CustomResourceDefinitionStatus

fun v1beta1_CustomResourceDefinitionStatus.acceptedNames(block: v1beta1_CustomResourceDefinitionNames.() -> Unit = {}) {
    if (acceptedNames == null) {
        acceptedNames = v1beta1_CustomResourceDefinitionNames()
    }

    acceptedNames.block()
}
