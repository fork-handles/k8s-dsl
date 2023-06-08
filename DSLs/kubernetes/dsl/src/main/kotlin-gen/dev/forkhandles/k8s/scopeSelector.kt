// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ResourceQuotaSpec as model_ResourceQuotaSpec
import io.fabric8.kubernetes.api.model.ScopeSelector as model_ScopeSelector

fun model_ResourceQuotaSpec.scopeSelector(block: model_ScopeSelector.() -> Unit = {}) {
    if (scopeSelector == null) {
        scopeSelector = model_ScopeSelector()
    }

    scopeSelector.block()
}
