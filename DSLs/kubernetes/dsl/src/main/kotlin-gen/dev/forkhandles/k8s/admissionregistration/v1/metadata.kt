// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfiguration as v1_MutatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfigurationList as v1_MutatingWebhookConfigurationList
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicy as v1_ValidatingAdmissionPolicy
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBinding as v1_ValidatingAdmissionPolicyBinding
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBindingList as v1_ValidatingAdmissionPolicyBindingList
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyList as v1_ValidatingAdmissionPolicyList
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

fun v1_ValidatingAdmissionPolicy.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1_ValidatingAdmissionPolicyBinding.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1_ValidatingAdmissionPolicyBindingList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun v1_ValidatingAdmissionPolicyList.metadata(block: model_ListMeta.() -> Unit = {}) {
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
