// GENERATED
package dev.forkhandles.k8s.apps

import io.fabric8.kubernetes.api.model.apps.StatefulSetOrdinals as apps_StatefulSetOrdinals
import io.fabric8.kubernetes.api.model.apps.StatefulSetSpec as apps_StatefulSetSpec

fun apps_StatefulSetSpec.ordinals(block: apps_StatefulSetOrdinals.() -> Unit = {}) {
    if (ordinals == null) {
        ordinals = apps_StatefulSetOrdinals()
    }

    ordinals.block()
}
