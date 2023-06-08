// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.HTTPGetAction as model_HTTPGetAction
import io.fabric8.kubernetes.api.model.LifecycleHandler as model_LifecycleHandler
import io.fabric8.kubernetes.api.model.Probe as model_Probe

fun model_LifecycleHandler.httpGet(block: model_HTTPGetAction.() -> Unit = {}) {
    if (httpGet == null) {
        httpGet = model_HTTPGetAction()
    }

    httpGet.block()
}

fun model_Probe.httpGet(block: model_HTTPGetAction.() -> Unit = {}) {
    if (httpGet == null) {
        httpGet = model_HTTPGetAction()
    }

    httpGet.block()
}
