// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.extensions.DaemonSet as extensions_DaemonSet
import io.fabric8.kubernetes.api.model.extensions.DaemonSetSpec as extensions_DaemonSetSpec
import io.fabric8.kubernetes.api.model.extensions.Deployment as extensions_Deployment
import io.fabric8.kubernetes.api.model.extensions.DeploymentSpec as extensions_DeploymentSpec
import io.fabric8.kubernetes.api.model.extensions.Ingress as extensions_Ingress
import io.fabric8.kubernetes.api.model.extensions.IngressSpec as extensions_IngressSpec
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicy as extensions_NetworkPolicy
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicySpec as extensions_NetworkPolicySpec
import io.fabric8.kubernetes.api.model.extensions.ReplicaSet as extensions_ReplicaSet
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetSpec as extensions_ReplicaSetSpec

fun extensions_DaemonSet.spec(block: extensions_DaemonSetSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = extensions_DaemonSetSpec()
    }

    spec.block()
}

fun extensions_Deployment.spec(block: extensions_DeploymentSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = extensions_DeploymentSpec()
    }

    spec.block()
}

fun extensions_Ingress.spec(block: extensions_IngressSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = extensions_IngressSpec()
    }

    spec.block()
}

fun extensions_NetworkPolicy.spec(block: extensions_NetworkPolicySpec.() -> Unit = {}) {
    if (spec == null) {
        spec = extensions_NetworkPolicySpec()
    }

    spec.block()
}

fun extensions_ReplicaSet.spec(block: extensions_ReplicaSetSpec.() -> Unit = {}) {
    if (spec == null) {
        spec = extensions_ReplicaSetSpec()
    }

    spec.block()
}
