// GENERATED
package dev.forkhandles.k8s.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionNames as v1beta1_CustomResourceDefinitionNames
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionSpec as v1beta1_CustomResourceDefinitionSpec

fun v1beta1_CustomResourceDefinitionSpec.names(block: v1beta1_CustomResourceDefinitionNames.() -> Unit = {}) {
    if (names == null) {
        names = v1beta1_CustomResourceDefinitionNames()
    }

    names.block()
}
