// GENERATED
package dev.forkhandles.k8s.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps as v1_JSONSchemaProps

fun v1_JSONSchemaProps.not(block: v1_JSONSchemaProps.() -> Unit = {}) {
    if (not == null) {
        not = v1_JSONSchemaProps()
    }

    not.block()
}
