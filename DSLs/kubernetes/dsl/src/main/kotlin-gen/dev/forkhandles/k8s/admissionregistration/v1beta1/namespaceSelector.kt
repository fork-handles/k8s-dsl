// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1beta1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MatchResources as v1beta1_MatchResources
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhook as v1beta1_MutatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhook as v1beta1_ValidatingWebhook

fun v1beta1_MatchResources.namespaceSelector(block: model_LabelSelector.() -> Unit = {}) {
    if (namespaceSelector == null) {
        namespaceSelector = model_LabelSelector()
    }

    namespaceSelector.block()
}

fun v1beta1_MutatingWebhook.namespaceSelector(block: model_LabelSelector.() -> Unit = {}) {
    if (namespaceSelector == null) {
        namespaceSelector = model_LabelSelector()
    }

    namespaceSelector.block()
}

fun v1beta1_ValidatingWebhook.namespaceSelector(block: model_LabelSelector.() -> Unit = {}) {
    if (namespaceSelector == null) {
        namespaceSelector = model_LabelSelector()
    }

    namespaceSelector.block()
}
