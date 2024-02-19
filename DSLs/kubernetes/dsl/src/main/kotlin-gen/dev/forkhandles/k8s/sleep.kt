// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.LifecycleHandler as model_LifecycleHandler
import io.fabric8.kubernetes.api.model.SleepAction as model_SleepAction

fun model_LifecycleHandler.sleep(block: model_SleepAction.() -> Unit = {}) {
    if (sleep == null) {
        sleep = model_SleepAction()
    }

    sleep.block()
}
