// GENERATED
package dev.forkhandles.k8s.authentication

import io.fabric8.kubernetes.api.model.authentication.TokenReview as authentication_TokenReview
import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatus as authentication_TokenReviewStatus

fun authentication_TokenReview.status(block: authentication_TokenReviewStatus.() -> Unit = {}) {
    if (status == null) {
        status = authentication_TokenReviewStatus()
    }

    status.block()
}
