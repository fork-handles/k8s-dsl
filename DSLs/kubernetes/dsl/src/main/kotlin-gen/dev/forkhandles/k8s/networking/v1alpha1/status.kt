// GENERATED
package dev.forkhandles.k8s.networking.v1alpha1

import io.fabric8.kubernetes.api.model.networking.v1alpha1.ServiceCIDR as v1alpha1_ServiceCIDR
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ServiceCIDRStatus as v1alpha1_ServiceCIDRStatus

fun v1alpha1_ServiceCIDR.status(block: v1alpha1_ServiceCIDRStatus.() -> Unit = {}) {
    if (status == null) {
        status = v1alpha1_ServiceCIDRStatus()
    }

    status.block()
}
