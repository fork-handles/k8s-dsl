// GENERATED
package dev.forkhandles.k8s.batch.v1beta1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.batch.v1beta1.CronJob as v1beta1_CronJob
import io.fabric8.kubernetes.api.model.batch.v1beta1.CronJobList as v1beta1_CronJobList
import io.fabric8.kubernetes.api.model.batch.v1beta1.JobTemplateSpec as v1beta1_JobTemplateSpec


fun v1beta1_CronJob.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (this.metadata == null) {
        this.metadata = model_ObjectMeta()
    }

    this.metadata!!.block()
}


fun v1beta1_CronJobList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (this.metadata == null) {
        this.metadata = model_ListMeta()
    }

    this.metadata!!.block()
}


fun v1beta1_JobTemplateSpec.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (this.metadata == null) {
        this.metadata = model_ObjectMeta()
    }

    this.metadata!!.block()
}

