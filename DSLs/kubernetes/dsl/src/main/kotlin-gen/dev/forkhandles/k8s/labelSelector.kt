// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ClusterTrustBundleProjection as model_ClusterTrustBundleProjection
import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.PodAffinityTerm as model_PodAffinityTerm
import io.fabric8.kubernetes.api.model.TopologySpreadConstraint as model_TopologySpreadConstraint

fun model_ClusterTrustBundleProjection.labelSelector(block: model_LabelSelector.() -> Unit = {}) {
    if (labelSelector == null) {
        labelSelector = model_LabelSelector()
    }

    labelSelector.block()
}

fun model_PodAffinityTerm.labelSelector(block: model_LabelSelector.() -> Unit = {}) {
    if (labelSelector == null) {
        labelSelector = model_LabelSelector()
    }

    labelSelector.block()
}

fun model_TopologySpreadConstraint.labelSelector(block: model_LabelSelector.() -> Unit = {}) {
    if (labelSelector == null) {
        labelSelector = model_LabelSelector()
    }

    labelSelector.block()
}
