// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1beta1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhookConfiguration as v1beta1_MutatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhookConfigurationList as v1beta1_MutatingWebhookConfigurationList
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicy as v1beta1_ValidatingAdmissionPolicy
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBinding as v1beta1_ValidatingAdmissionPolicyBinding
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBindingList as v1beta1_ValidatingAdmissionPolicyBindingList
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyList as v1beta1_ValidatingAdmissionPolicyList
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhookConfiguration as v1beta1_ValidatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhookConfigurationList as v1beta1_ValidatingWebhookConfigurationList

fun v1beta1_MutatingWebhookConfiguration.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1beta1_MutatingWebhookConfigurationList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun v1beta1_ValidatingAdmissionPolicy.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1beta1_ValidatingAdmissionPolicyBinding.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1beta1_ValidatingAdmissionPolicyBindingList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun v1beta1_ValidatingAdmissionPolicyList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun v1beta1_ValidatingWebhookConfiguration.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1beta1_ValidatingWebhookConfigurationList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
