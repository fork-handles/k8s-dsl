// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Event as model_Event
import io.fabric8.kubernetes.api.model.EventSeries as model_EventSeries

fun model_Event.series(block: model_EventSeries.() -> Unit = {}) {
    if (series == null) {
        series = model_EventSeries()
    }

    series.block()
}
