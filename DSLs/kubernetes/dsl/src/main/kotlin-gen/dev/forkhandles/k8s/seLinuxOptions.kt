// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PodSecurityContext as model_PodSecurityContext
import io.fabric8.kubernetes.api.model.SELinuxOptions as model_SELinuxOptions
import io.fabric8.kubernetes.api.model.SecurityContext as model_SecurityContext

fun model_PodSecurityContext.seLinuxOptions(block: model_SELinuxOptions.() -> Unit = {}) {
    if (seLinuxOptions == null) {
        seLinuxOptions = model_SELinuxOptions()
    }

    seLinuxOptions.block()
}

fun model_SecurityContext.seLinuxOptions(block: model_SELinuxOptions.() -> Unit = {}) {
    if (seLinuxOptions == null) {
        seLinuxOptions = model_SELinuxOptions()
    }

    seLinuxOptions.block()
}
