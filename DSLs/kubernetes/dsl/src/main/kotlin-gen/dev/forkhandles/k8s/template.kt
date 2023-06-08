// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PodTemplate as model_PodTemplate
import io.fabric8.kubernetes.api.model.PodTemplateSpec as model_PodTemplateSpec
import io.fabric8.kubernetes.api.model.ReplicationControllerSpec as model_ReplicationControllerSpec

fun model_PodTemplate.template(block: model_PodTemplateSpec.() -> Unit = {}) {
    if (template == null) {
        template = model_PodTemplateSpec()
    }

    template.block()
}

fun model_ReplicationControllerSpec.template(block: model_PodTemplateSpec.() -> Unit = {}) {
    if (template == null) {
        template = model_PodTemplateSpec()
    }

    template.block()
}
