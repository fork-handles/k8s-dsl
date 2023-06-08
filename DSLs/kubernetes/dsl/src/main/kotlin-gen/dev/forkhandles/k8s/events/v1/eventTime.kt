// GENERATED
package dev.forkhandles.k8s.events.v1

import io.fabric8.kubernetes.api.model.MicroTime as model_MicroTime
import io.fabric8.kubernetes.api.model.events.v1.Event as v1_Event

fun v1_Event.eventTime(block: model_MicroTime.() -> Unit = {}) {
    if (eventTime == null) {
        eventTime = model_MicroTime()
    }

    eventTime.block()
}
