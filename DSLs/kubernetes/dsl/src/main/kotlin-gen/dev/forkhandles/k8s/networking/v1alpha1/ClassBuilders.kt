// GENERATE
package dev.forkhandles.k8s.networking.v1alpha1

import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddress as v1alpha1_IPAddress
import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddressList as v1alpha1_IPAddressList
import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddressSpec as v1alpha1_IPAddressSpec
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ParentReference as v1alpha1_ParentReference
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ServiceCIDR as v1alpha1_ServiceCIDR
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ServiceCIDRList as v1alpha1_ServiceCIDRList
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ServiceCIDRSpec as v1alpha1_ServiceCIDRSpec
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ServiceCIDRStatus as v1alpha1_ServiceCIDRStatus

fun newIPAddress(block: v1alpha1_IPAddress.() -> Unit = {}): v1alpha1_IPAddress {
    val instance = v1alpha1_IPAddress()
    instance.block()
    return instance
}

fun newIPAddressList(block: v1alpha1_IPAddressList.() -> Unit = {}): v1alpha1_IPAddressList {
    val instance = v1alpha1_IPAddressList()
    instance.block()
    return instance
}

fun newIPAddressSpec(block: v1alpha1_IPAddressSpec.() -> Unit = {}): v1alpha1_IPAddressSpec {
    val instance = v1alpha1_IPAddressSpec()
    instance.block()
    return instance
}

fun newParentReference(block: v1alpha1_ParentReference.() -> Unit = {}): v1alpha1_ParentReference {
    val instance = v1alpha1_ParentReference()
    instance.block()
    return instance
}

fun newServiceCIDR(block: v1alpha1_ServiceCIDR.() -> Unit = {}): v1alpha1_ServiceCIDR {
    val instance = v1alpha1_ServiceCIDR()
    instance.block()
    return instance
}

fun newServiceCIDRList(block: v1alpha1_ServiceCIDRList.() -> Unit = {}): v1alpha1_ServiceCIDRList {
    val instance = v1alpha1_ServiceCIDRList()
    instance.block()
    return instance
}

fun newServiceCIDRSpec(block: v1alpha1_ServiceCIDRSpec.() -> Unit = {}): v1alpha1_ServiceCIDRSpec {
    val instance = v1alpha1_ServiceCIDRSpec()
    instance.block()
    return instance
}

fun newServiceCIDRStatus(block: v1alpha1_ServiceCIDRStatus.() -> Unit = {}): v1alpha1_ServiceCIDRStatus {
    val instance = v1alpha1_ServiceCIDRStatus()
    instance.block()
    return instance
}
