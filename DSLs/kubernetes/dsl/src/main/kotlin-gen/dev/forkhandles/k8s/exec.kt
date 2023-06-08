// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.AuthInfo as model_AuthInfo
import io.fabric8.kubernetes.api.model.ExecAction as model_ExecAction
import io.fabric8.kubernetes.api.model.ExecConfig as model_ExecConfig
import io.fabric8.kubernetes.api.model.LifecycleHandler as model_LifecycleHandler
import io.fabric8.kubernetes.api.model.Probe as model_Probe

fun model_AuthInfo.exec(block: model_ExecConfig.() -> Unit = {}) {
    if (exec == null) {
        exec = model_ExecConfig()
    }

    exec.block()
}

fun model_LifecycleHandler.exec(block: model_ExecAction.() -> Unit = {}) {
    if (exec == null) {
        exec = model_ExecAction()
    }

    exec.block()
}

fun model_Probe.exec(block: model_ExecAction.() -> Unit = {}) {
    if (exec == null) {
        exec = model_ExecAction()
    }

    exec.block()
}
