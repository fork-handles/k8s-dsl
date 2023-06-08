// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.PodTemplateSpec as model_PodTemplateSpec
import io.fabric8.kubernetes.api.model.extensions.DaemonSetSpec as extensions_DaemonSetSpec
import io.fabric8.kubernetes.api.model.extensions.DeploymentSpec as extensions_DeploymentSpec
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetSpec as extensions_ReplicaSetSpec

fun extensions_DaemonSetSpec.template(block: model_PodTemplateSpec.() -> Unit = {}) {
    if (template == null) {
        template = model_PodTemplateSpec()
    }

    template.block()
}

fun extensions_DeploymentSpec.template(block: model_PodTemplateSpec.() -> Unit = {}) {
    if (template == null) {
        template = model_PodTemplateSpec()
    }

    template.block()
}

fun extensions_ReplicaSetSpec.template(block: model_PodTemplateSpec.() -> Unit = {}) {
    if (template == null) {
        template = model_PodTemplateSpec()
    }

    template.block()
}
