// GENERATED
package dev.forkhandles.k8s.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.ConversionRequest as v1_ConversionRequest
import io.fabric8.kubernetes.api.model.apiextensions.v1.ConversionReview as v1_ConversionReview

fun v1_ConversionReview.request(block: v1_ConversionRequest.() -> Unit = {}) {
    if (request == null) {
        request = v1_ConversionRequest()
    }

    request.block()
}
