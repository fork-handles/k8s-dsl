// GENERATED
package dev.forkhandles.k8s.rbac

import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding as rbac_ClusterRoleBinding
import io.fabric8.kubernetes.api.model.rbac.RoleBinding as rbac_RoleBinding
import io.fabric8.kubernetes.api.model.rbac.RoleRef as rbac_RoleRef

fun rbac_ClusterRoleBinding.roleRef(block: rbac_RoleRef.() -> Unit = {}) {
    if (roleRef == null) {
        roleRef = rbac_RoleRef()
    }

    roleRef.block()
}

fun rbac_RoleBinding.roleRef(block: rbac_RoleRef.() -> Unit = {}) {
    if (roleRef == null) {
        roleRef = rbac_RoleRef()
    }

    roleRef.block()
}
