// GENERATED
package dev.forkhandles.k8s.networking.v1alpha1

import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddressSpec as v1alpha1_IPAddressSpec
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ParentReference as v1alpha1_ParentReference

fun v1alpha1_IPAddressSpec.parentRef(block: v1alpha1_ParentReference.() -> Unit = {}) {
    if (parentRef == null) {
        parentRef = v1alpha1_ParentReference()
    }

    parentRef.block()
}
