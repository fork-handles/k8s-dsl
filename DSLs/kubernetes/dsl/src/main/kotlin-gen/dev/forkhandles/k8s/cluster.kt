// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Cluster as model_Cluster
import io.fabric8.kubernetes.api.model.NamedCluster as model_NamedCluster

fun model_NamedCluster.cluster(block: model_Cluster.() -> Unit = {}) {
    if (cluster == null) {
        cluster = model_Cluster()
    }

    cluster.block()
}
