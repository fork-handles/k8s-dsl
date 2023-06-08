// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.NodeSelectorTerm as model_NodeSelectorTerm
import io.fabric8.kubernetes.api.model.PreferredSchedulingTerm as model_PreferredSchedulingTerm

fun model_PreferredSchedulingTerm.preference(block: model_NodeSelectorTerm.() -> Unit = {}) {
    if (preference == null) {
        preference = model_NodeSelectorTerm()
    }

    preference.block()
}
