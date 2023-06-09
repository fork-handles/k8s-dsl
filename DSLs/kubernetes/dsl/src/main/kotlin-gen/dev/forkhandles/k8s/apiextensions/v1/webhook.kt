// GENERATED
package dev.forkhandles.k8s.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceConversion as v1_CustomResourceConversion
import io.fabric8.kubernetes.api.model.apiextensions.v1.WebhookConversion as v1_WebhookConversion

fun v1_CustomResourceConversion.webhook(block: v1_WebhookConversion.() -> Unit = {}) {
    if (webhook == null) {
        webhook = v1_WebhookConversion()
    }

    webhook.block()
}
