// GENERATED
package dev.forkhandles.k8s.certificates.v1alpha1

import io.fabric8.kubernetes.api.model.certificates.v1alpha1.ClusterTrustBundle as v1alpha1_ClusterTrustBundle
import io.fabric8.kubernetes.api.model.certificates.v1alpha1.ClusterTrustBundleSpec as v1alpha1_ClusterTrustBundleSpec

fun v1alpha1_ClusterTrustBundle.spec(block: v1alpha1_ClusterTrustBundleSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = v1alpha1_ClusterTrustBundleSpec()
    }

    spec.block()
}
