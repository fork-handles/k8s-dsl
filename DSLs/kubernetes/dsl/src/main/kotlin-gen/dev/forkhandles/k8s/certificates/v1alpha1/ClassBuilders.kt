// GENERATE
package dev.forkhandles.k8s.certificates.v1alpha1

import io.fabric8.kubernetes.api.model.certificates.v1alpha1.ClusterTrustBundle as v1alpha1_ClusterTrustBundle
import io.fabric8.kubernetes.api.model.certificates.v1alpha1.ClusterTrustBundleList as v1alpha1_ClusterTrustBundleList
import io.fabric8.kubernetes.api.model.certificates.v1alpha1.ClusterTrustBundleSpec as v1alpha1_ClusterTrustBundleSpec

fun newClusterTrustBundle(block: v1alpha1_ClusterTrustBundle.() -> Unit = {}): v1alpha1_ClusterTrustBundle {
    val instance = v1alpha1_ClusterTrustBundle()
    instance.block()
    return instance
}

fun newClusterTrustBundleList(block: v1alpha1_ClusterTrustBundleList.() -> Unit = {}): v1alpha1_ClusterTrustBundleList {
    val instance = v1alpha1_ClusterTrustBundleList()
    instance.block()
    return instance
}

fun newClusterTrustBundleSpec(block: v1alpha1_ClusterTrustBundleSpec.() -> Unit = {}): v1alpha1_ClusterTrustBundleSpec {
    val instance = v1alpha1_ClusterTrustBundleSpec()
    instance.block()
    return instance
}
