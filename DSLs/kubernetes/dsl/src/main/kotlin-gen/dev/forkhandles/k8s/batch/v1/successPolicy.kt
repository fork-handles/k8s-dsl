// GENERATED
package dev.forkhandles.k8s.batch.v1

import io.fabric8.kubernetes.api.model.batch.v1.JobSpec as v1_JobSpec
import io.fabric8.kubernetes.api.model.batch.v1.SuccessPolicy as v1_SuccessPolicy

fun v1_JobSpec.successPolicy(block: v1_SuccessPolicy.() -> Unit = {}) {
    if (successPolicy == null) {
        successPolicy = v1_SuccessPolicy()
    }

    successPolicy.block()
}
