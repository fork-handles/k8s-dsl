// GENERATED
package dev.forkhandles.k8s.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceConversion as v1beta1_CustomResourceConversion
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionSpec as v1beta1_CustomResourceDefinitionSpec

fun v1beta1_CustomResourceDefinitionSpec.conversion(block: v1beta1_CustomResourceConversion.() -> Unit = {}) {
    if (conversion == null) {
        conversion = v1beta1_CustomResourceConversion()
    }

    conversion.block()
}
