// GENERATED
package dev.forkhandles.k8s.batch.v1beta1

import io.fabric8.kubernetes.api.model.batch.v1.JobSpec as v1_JobSpec
import io.fabric8.kubernetes.api.model.batch.v1beta1.CronJob as v1beta1_CronJob
import io.fabric8.kubernetes.api.model.batch.v1beta1.CronJobSpec as v1beta1_CronJobSpec
import io.fabric8.kubernetes.api.model.batch.v1beta1.JobTemplateSpec as v1beta1_JobTemplateSpec

fun v1beta1_CronJob.spec(block: v1beta1_CronJobSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1beta1_CronJobSpec()
    }

    spec.block()
}

fun v1beta1_JobTemplateSpec.spec(block: v1_JobSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1_JobSpec()
    }

    spec.block()
}
