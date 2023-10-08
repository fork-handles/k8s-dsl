// GENERATED
package dev.forkhandles.k8s.authentication

import io.fabric8.kubernetes.api.model.authentication.SelfSubjectReview as authentication_SelfSubjectReview
import io.fabric8.kubernetes.api.model.authentication.SelfSubjectReviewStatus as authentication_SelfSubjectReviewStatus
import io.fabric8.kubernetes.api.model.authentication.TokenRequest as authentication_TokenRequest
import io.fabric8.kubernetes.api.model.authentication.TokenRequestStatus as authentication_TokenRequestStatus
import io.fabric8.kubernetes.api.model.authentication.TokenReview as authentication_TokenReview
import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatus as authentication_TokenReviewStatus

fun authentication_SelfSubjectReview.status(block: authentication_SelfSubjectReviewStatus.() -> Unit = {}) {
    if (status == null) {
        status = authentication_SelfSubjectReviewStatus()
    }

    status.block()
}

fun authentication_TokenRequest.status(block: authentication_TokenRequestStatus.() -> Unit = {}) {
    if (status == null) {
        status = authentication_TokenRequestStatus()
    }

    status.block()
}

fun authentication_TokenReview.status(block: authentication_TokenReviewStatus.() -> Unit = {}) {
    if (status == null) {
        status = authentication_TokenReviewStatus()
    }

    status.block()
}
