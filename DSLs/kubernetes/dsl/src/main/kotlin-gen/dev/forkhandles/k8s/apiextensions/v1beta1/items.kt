// GENERATED
package dev.forkhandles.k8s.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.JSONSchemaProps as v1beta1_JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.JSONSchemaPropsOrArray as v1beta1_JSONSchemaPropsOrArray


fun v1beta1_JSONSchemaProps.`items`(block: v1beta1_JSONSchemaPropsOrArray.() -> Unit = {}) {
    if (this.`items` == null) {
        this.`items` = v1beta1_JSONSchemaPropsOrArray()
    }

    this.`items`.block()
}

