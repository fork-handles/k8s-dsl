// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.APIServiceSpec as model_APIServiceSpec
import io.fabric8.kubernetes.api.model.ServiceReference as model_ServiceReference

fun model_APIServiceSpec.service(block: model_ServiceReference.() -> Unit = {}) {
    if (service == null) {
        service = model_ServiceReference()
    }

    service.block()
}
