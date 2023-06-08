// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.APIGroup as model_APIGroup
import io.fabric8.kubernetes.api.model.GroupVersionForDiscovery as model_GroupVersionForDiscovery

fun model_APIGroup.preferredVersion(block: model_GroupVersionForDiscovery.() -> Unit = {}) {
    if (preferredVersion == null) {
        preferredVersion = model_GroupVersionForDiscovery()
    }

    preferredVersion.block()
}
