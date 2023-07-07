// GENERATED
package dev.forkhandles.k8s.authentication

import io.fabric8.kubernetes.api.model.authentication.TokenRequest as authentication_TokenRequest
import io.fabric8.kubernetes.api.model.authentication.TokenRequestSpec as authentication_TokenRequestSpec
import io.fabric8.kubernetes.api.model.authentication.TokenReview as authentication_TokenReview
import io.fabric8.kubernetes.api.model.authentication.TokenReviewSpec as authentication_TokenReviewSpec

fun authentication_TokenRequest.spec(block: authentication_TokenRequestSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = authentication_TokenRequestSpec()
    }

    spec.block()
}

fun authentication_TokenReview.spec(block: authentication_TokenReviewSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = authentication_TokenReviewSpec()
    }

    spec.block()
}
