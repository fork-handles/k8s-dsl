// GENERATED
package dev.forkhandles.k8s.authorization.v1beta1

import io.fabric8.kubernetes.api.model.authorization.v1beta1.NonResourceAttributes as v1beta1_NonResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectAccessReviewSpec as v1beta1_SelfSubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectAccessReviewSpec as v1beta1_SubjectAccessReviewSpec

fun v1beta1_SelfSubjectAccessReviewSpec.nonResourceAttributes(block: v1beta1_NonResourceAttributes.() -> Unit = {}) {
    if (nonResourceAttributes == null) {
        nonResourceAttributes = v1beta1_NonResourceAttributes()
    }

    nonResourceAttributes.block()
}

fun v1beta1_SubjectAccessReviewSpec.nonResourceAttributes(block: v1beta1_NonResourceAttributes.() -> Unit = {}) {
    if (nonResourceAttributes == null) {
        nonResourceAttributes = v1beta1_NonResourceAttributes()
    }

    nonResourceAttributes.block()
}
