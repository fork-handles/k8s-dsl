// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.PodSecurityContext as model_PodSecurityContext
import io.fabric8.kubernetes.api.model.SecurityContext as model_SecurityContext
import io.fabric8.kubernetes.api.model.WindowsSecurityContextOptions as model_WindowsSecurityContextOptions

fun model_PodSecurityContext.windowsOptions(block: model_WindowsSecurityContextOptions.() -> Unit = {}) {
    if (windowsOptions == null) {
        windowsOptions = model_WindowsSecurityContextOptions()
    }

    windowsOptions.block()
}

fun model_SecurityContext.windowsOptions(block: model_WindowsSecurityContextOptions.() -> Unit = {}) {
    if (windowsOptions == null) {
        windowsOptions = model_WindowsSecurityContextOptions()
    }

    windowsOptions.block()
}
