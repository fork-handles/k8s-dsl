// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ClusterTrustBundleProjection as model_ClusterTrustBundleProjection
import io.fabric8.kubernetes.api.model.VolumeProjection as model_VolumeProjection

fun model_VolumeProjection.clusterTrustBundle(block: model_ClusterTrustBundleProjection.() -> Unit = {}) {
    if (clusterTrustBundle == null) {
        clusterTrustBundle = model_ClusterTrustBundleProjection()
    }

    clusterTrustBundle.block()
}
