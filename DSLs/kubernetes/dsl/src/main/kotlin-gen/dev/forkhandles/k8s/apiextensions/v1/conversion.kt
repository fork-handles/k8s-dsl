// GENERATED
package dev.forkhandles.k8s.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceConversion as v1_CustomResourceConversion
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionSpec as v1_CustomResourceDefinitionSpec

fun v1_CustomResourceDefinitionSpec.conversion(block: v1_CustomResourceConversion.() -> Unit = {}) {
    if (conversion == null) {
        conversion = v1_CustomResourceConversion()
    }

    conversion.block()
}
