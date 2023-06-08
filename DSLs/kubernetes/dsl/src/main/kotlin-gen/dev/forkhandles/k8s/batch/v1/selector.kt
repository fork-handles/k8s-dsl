// GENERATED
package dev.forkhandles.k8s.batch.v1

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.batch.v1.JobSpec as v1_JobSpec

fun v1_JobSpec.selector(block: model_LabelSelector.() -> Unit = {}) {
    if (selector == null) {
        selector = model_LabelSelector()
    }

    selector.block()
}
