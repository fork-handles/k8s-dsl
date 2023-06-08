// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Event as model_Event
import io.fabric8.kubernetes.api.model.MicroTime as model_MicroTime

fun model_Event.eventTime(block: model_MicroTime.() -> Unit = {}) {
    if (eventTime == null) {
        eventTime = model_MicroTime()
    }

    eventTime.block()
}
