// GENERATED
package dev.forkhandles.k8s.networking.v1alpha1

import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddress as v1alpha1_IPAddress
import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddressSpec as v1alpha1_IPAddressSpec
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ServiceCIDR as v1alpha1_ServiceCIDR
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ServiceCIDRSpec as v1alpha1_ServiceCIDRSpec

fun v1alpha1_IPAddress.spec(block: v1alpha1_IPAddressSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1alpha1_IPAddressSpec()
    }

    spec.block()
}

fun v1alpha1_ServiceCIDR.spec(block: v1alpha1_ServiceCIDRSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1alpha1_ServiceCIDRSpec()
    }

    spec.block()
}
