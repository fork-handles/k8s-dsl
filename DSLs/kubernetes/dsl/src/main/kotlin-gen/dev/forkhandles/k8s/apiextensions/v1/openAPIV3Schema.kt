// GENERATED
package dev.forkhandles.k8s.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceValidation as v1_CustomResourceValidation
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps as v1_JSONSchemaProps

fun v1_CustomResourceValidation.openAPIV3Schema(block: v1_JSONSchemaProps.() -> Unit = {}) {
    if (openAPIV3Schema == null) {
        openAPIV3Schema = v1_JSONSchemaProps()
    }

    openAPIV3Schema.block()
}
