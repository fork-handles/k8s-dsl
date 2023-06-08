// GENERATED
package dev.forkhandles.k8s.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.ConversionResponse as v1_ConversionResponse
import io.fabric8.kubernetes.api.model.apiextensions.v1.ConversionReview as v1_ConversionReview

fun v1_ConversionReview.response(block: v1_ConversionResponse.() -> Unit = {}) {
    if (response == null) {
        response = v1_ConversionResponse()
    }

    response.block()
}
