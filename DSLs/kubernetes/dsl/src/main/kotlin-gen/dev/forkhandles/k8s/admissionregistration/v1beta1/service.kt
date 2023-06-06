// GENERATED
package dev.forkhandles.k8s.admissionregistration.v1beta1

import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ServiceReference as v1beta1_ServiceReference
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.WebhookClientConfig as v1beta1_WebhookClientConfig


fun v1beta1_WebhookClientConfig.`service`(block: v1beta1_ServiceReference.() -> Unit = {}) {
    if (this.`service` == null) {
        this.`service` = v1beta1_ServiceReference()
    }

    this.`service`.block()
}

