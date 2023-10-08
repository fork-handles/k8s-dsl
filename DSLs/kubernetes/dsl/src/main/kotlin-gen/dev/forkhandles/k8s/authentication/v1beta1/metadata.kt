// GENERATED
package dev.forkhandles.k8s.authentication.v1beta1

import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.authentication.v1beta1.SelfSubjectReview as v1beta1_SelfSubjectReview

fun v1beta1_SelfSubjectReview.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}
