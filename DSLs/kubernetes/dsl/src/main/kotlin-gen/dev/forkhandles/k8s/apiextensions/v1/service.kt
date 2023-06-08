// GENERATED
package dev.forkhandles.k8s.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.ServiceReference as v1_ServiceReference
import io.fabric8.kubernetes.api.model.apiextensions.v1.WebhookClientConfig as v1_WebhookClientConfig

fun v1_WebhookClientConfig.service(block: v1_ServiceReference.() -> Unit = {}) {
    if (service == null) {
        service = v1_ServiceReference()
    }

    service.block()
}
