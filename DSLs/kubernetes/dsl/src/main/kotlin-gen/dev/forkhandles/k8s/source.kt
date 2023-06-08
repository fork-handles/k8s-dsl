// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ClaimSource as model_ClaimSource
import io.fabric8.kubernetes.api.model.Event as model_Event
import io.fabric8.kubernetes.api.model.EventSource as model_EventSource
import io.fabric8.kubernetes.api.model.PodResourceClaim as model_PodResourceClaim

fun model_Event.source(block: model_EventSource.() -> Unit = {}) {
    if (source == null) {
        source = model_EventSource()
    }

    source.block()
}

fun model_PodResourceClaim.source(block: model_ClaimSource.() -> Unit = {}) {
    if (source == null) {
        source = model_ClaimSource()
    }

    source.block()
}
