// GENERATED
package dev.forkhandles.k8s.certificates.v1alpha1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.certificates.v1alpha1.ClusterTrustBundle as v1alpha1_ClusterTrustBundle
import io.fabric8.kubernetes.api.model.certificates.v1alpha1.ClusterTrustBundleList as v1alpha1_ClusterTrustBundleList

fun v1alpha1_ClusterTrustBundle.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1alpha1_ClusterTrustBundleList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
