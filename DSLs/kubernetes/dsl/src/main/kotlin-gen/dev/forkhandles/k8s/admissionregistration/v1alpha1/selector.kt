// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1alpha1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ParamRef as v1alpha1_ParamRef

fun v1alpha1_ParamRef.selector(block: model_LabelSelector.() -> Unit = {}) {
    if (selector == null) {
        selector = model_LabelSelector()
    }

    selector.block()
}
