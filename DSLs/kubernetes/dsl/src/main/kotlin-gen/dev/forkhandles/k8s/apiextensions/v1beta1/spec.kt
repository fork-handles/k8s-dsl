// GENERATED
package dev.forkhandles.k8s.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinition as v1beta1_CustomResourceDefinition
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionSpec as v1beta1_CustomResourceDefinitionSpec

fun v1beta1_CustomResourceDefinition.spec(block: v1beta1_CustomResourceDefinitionSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1beta1_CustomResourceDefinitionSpec()
    }

    spec.block()
}
