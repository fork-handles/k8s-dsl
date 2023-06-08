// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfiguration as v1_MutatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfigurationList as v1_MutatingWebhookConfigurationList
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhookConfiguration as v1_ValidatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhookConfigurationList as v1_ValidatingWebhookConfigurationList

fun v1_MutatingWebhookConfiguration.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1_MutatingWebhookConfigurationList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun v1_ValidatingWebhookConfiguration.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1_ValidatingWebhookConfigurationList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
