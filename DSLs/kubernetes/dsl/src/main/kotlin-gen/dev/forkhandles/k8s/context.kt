// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Context as model_Context
import io.fabric8.kubernetes.api.model.NamedContext as model_NamedContext

fun model_NamedContext.context(block: model_Context.() -> Unit = {}) {
    if (context == null) {
        context = model_Context()
    }

    context.block()
}
