// GENERATED
package dev.forkhandles.k8s.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.ExternalDocumentation as v1_ExternalDocumentation
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps as v1_JSONSchemaProps

fun v1_JSONSchemaProps.externalDocs(block: v1_ExternalDocumentation.() -> Unit = {}) {
    if (externalDocs == null) {
        externalDocs = v1_ExternalDocumentation()
    }

    externalDocs.block()
}
