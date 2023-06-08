// GENERATED
package dev.forkhandles.k8s.authorization.v1beta1

import io.fabric8.kubernetes.api.model.authorization.v1beta1.LocalSubjectAccessReview as v1beta1_LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectAccessReview as v1beta1_SelfSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectRulesReview as v1beta1_SelfSubjectRulesReview
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectAccessReview as v1beta1_SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectAccessReviewStatus as v1beta1_SubjectAccessReviewStatus
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectRulesReviewStatus as v1beta1_SubjectRulesReviewStatus

fun v1beta1_LocalSubjectAccessReview.status(block: v1beta1_SubjectAccessReviewStatus.() -> Unit = {}) {
    if (status == null) {
        status = v1beta1_SubjectAccessReviewStatus()
    }

    status.block()
}

fun v1beta1_SelfSubjectAccessReview.status(block: v1beta1_SubjectAccessReviewStatus.() -> Unit = {}) {
    if (status == null) {
        status = v1beta1_SubjectAccessReviewStatus()
    }

    status.block()
}

fun v1beta1_SelfSubjectRulesReview.status(block: v1beta1_SubjectRulesReviewStatus.() -> Unit = {}) {
    if (status == null) {
        status = v1beta1_SubjectRulesReviewStatus()
    }

    status.block()
}

fun v1beta1_SubjectAccessReview.status(block: v1beta1_SubjectAccessReviewStatus.() -> Unit = {}) {
    if (status == null) {
        status = v1beta1_SubjectAccessReviewStatus()
    }

    status.block()
}
