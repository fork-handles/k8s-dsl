// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1

import io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhook as v1_MutatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhook as v1_ValidatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1.WebhookClientConfig as v1_WebhookClientConfig

fun v1_MutatingWebhook.clientConfig(block: v1_WebhookClientConfig.() -> Unit = {}) {
    if (clientConfig == null) {
        clientConfig = v1_WebhookClientConfig()
    }

    clientConfig.block()
}

fun v1_ValidatingWebhook.clientConfig(block: v1_WebhookClientConfig.() -> Unit = {}) {
    if (clientConfig == null) {
        clientConfig = v1_WebhookClientConfig()
    }

    clientConfig.block()
}
