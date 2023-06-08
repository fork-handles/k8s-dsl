// GENERATED
package dev.forkhandles.k8s.batch.v1

import io.fabric8.kubernetes.api.model.batch.v1.CronJob as v1_CronJob
import io.fabric8.kubernetes.api.model.batch.v1.CronJobStatus as v1_CronJobStatus
import io.fabric8.kubernetes.api.model.batch.v1.Job as v1_Job
import io.fabric8.kubernetes.api.model.batch.v1.JobStatus as v1_JobStatus

fun v1_CronJob.status(block: v1_CronJobStatus.() -> Unit = {}) {
    if (status == null) {
        status = v1_CronJobStatus()
    }

    status.block()
}

fun v1_Job.status(block: v1_JobStatus.() -> Unit = {}) {
    if (status == null) {
        status = v1_JobStatus()
    }

    status.block()
}
