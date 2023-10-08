// GENERATE
package dev.forkhandles.k8s.networking.v1alpha1

import io.fabric8.kubernetes.api.model.networking.v1alpha1.ClusterCIDR as v1alpha1_ClusterCIDR
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ClusterCIDRList as v1alpha1_ClusterCIDRList
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ClusterCIDRSpec as v1alpha1_ClusterCIDRSpec
import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddress as v1alpha1_IPAddress
import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddressList as v1alpha1_IPAddressList
import io.fabric8.kubernetes.api.model.networking.v1alpha1.IPAddressSpec as v1alpha1_IPAddressSpec
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ParentReference as v1alpha1_ParentReference

fun newClusterCIDR(block: v1alpha1_ClusterCIDR.() -> Unit = {}): v1alpha1_ClusterCIDR {
    val instance = v1alpha1_ClusterCIDR()
    instance.block()
    return instance
}

fun newClusterCIDRList(block: v1alpha1_ClusterCIDRList.() -> Unit = {}): v1alpha1_ClusterCIDRList {
    val instance = v1alpha1_ClusterCIDRList()
    instance.block()
    return instance
}

fun newClusterCIDRSpec(block: v1alpha1_ClusterCIDRSpec.() -> Unit = {}): v1alpha1_ClusterCIDRSpec {
    val instance = v1alpha1_ClusterCIDRSpec()
    instance.block()
    return instance
}

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
