// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.EventSeries as model_EventSeries
import io.fabric8.kubernetes.api.model.MicroTime as model_MicroTime

fun model_EventSeries.lastObservedTime(block: model_MicroTime.() -> Unit = {}) {
    if (lastObservedTime == null) {
        lastObservedTime = model_MicroTime()
    }

    lastObservedTime.block()
}
