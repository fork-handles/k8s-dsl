// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Quantity as model_Quantity
import io.fabric8.kubernetes.api.model.ResourceFieldSelector as model_ResourceFieldSelector

fun model_ResourceFieldSelector.divisor(block: model_Quantity.() -> Unit = {}) {
    if (divisor == null) {
        divisor = model_Quantity()
    }

    divisor.block()
}
