// GENERATED
package dev.forkhandles.k8s.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionSpec as v1beta1_CustomResourceDefinitionSpec
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceValidation as v1beta1_CustomResourceValidation

fun v1beta1_CustomResourceDefinitionSpec.validation(block: v1beta1_CustomResourceValidation.() -> Unit = {}) {
    if (validation == null) {
        validation = v1beta1_CustomResourceValidation()
    }

    validation.block()
}
