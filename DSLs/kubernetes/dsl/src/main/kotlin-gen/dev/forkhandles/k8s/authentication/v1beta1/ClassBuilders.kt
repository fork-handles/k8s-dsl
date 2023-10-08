// GENERATE
package dev.forkhandles.k8s.authentication.v1beta1

import io.fabric8.kubernetes.api.model.authentication.v1beta1.SelfSubjectReview as v1beta1_SelfSubjectReview
import io.fabric8.kubernetes.api.model.authentication.v1beta1.SelfSubjectReviewStatus as v1beta1_SelfSubjectReviewStatus

fun newSelfSubjectReview(block: v1beta1_SelfSubjectReview.() -> Unit = {}): v1beta1_SelfSubjectReview {
    val instance = v1beta1_SelfSubjectReview()
    instance.block()
    return instance
}

fun newSelfSubjectReviewStatus(block: v1beta1_SelfSubjectReviewStatus.() -> Unit = {}): v1beta1_SelfSubjectReviewStatus {
    val instance = v1beta1_SelfSubjectReviewStatus()
    instance.block()
    return instance
}
