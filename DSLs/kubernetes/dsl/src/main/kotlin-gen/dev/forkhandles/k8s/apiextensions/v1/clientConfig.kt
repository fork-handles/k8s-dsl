// GENERATED
package dev.forkhandles.k8s.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.WebhookClientConfig as v1_WebhookClientConfig
import io.fabric8.kubernetes.api.model.apiextensions.v1.WebhookConversion as v1_WebhookConversion

fun v1_WebhookConversion.clientConfig(block: v1_WebhookClientConfig.() -> Unit = {}) {
    if (clientConfig == null) {
        clientConfig = v1_WebhookClientConfig()
    }

    clientConfig.block()
}
