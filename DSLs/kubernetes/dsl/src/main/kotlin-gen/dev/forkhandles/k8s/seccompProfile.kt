// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PodSecurityContext as model_PodSecurityContext
import io.fabric8.kubernetes.api.model.SeccompProfile as model_SeccompProfile
import io.fabric8.kubernetes.api.model.SecurityContext as model_SecurityContext

fun model_PodSecurityContext.seccompProfile(block: model_SeccompProfile.() -> Unit = {}) {
    if (seccompProfile == null) {
        seccompProfile = model_SeccompProfile()
    }

    seccompProfile.block()
}

fun model_SecurityContext.seccompProfile(block: model_SeccompProfile.() -> Unit = {}) {
    if (seccompProfile == null) {
        seccompProfile = model_SeccompProfile()
    }

    seccompProfile.block()
}
