// GENERATED
package dev.forkhandles.k8s.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps as v1_JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaPropsOrBool as v1_JSONSchemaPropsOrBool

fun v1_JSONSchemaProps.additionalProperties(block: v1_JSONSchemaPropsOrBool.() -> Unit = {}) {
    if (additionalProperties == null) {
        additionalProperties = v1_JSONSchemaPropsOrBool()
    }

    additionalProperties.block()
}
