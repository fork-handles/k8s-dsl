// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.AuthInfo as model_AuthInfo
import io.fabric8.kubernetes.api.model.NamedAuthInfo as model_NamedAuthInfo

fun model_NamedAuthInfo.user(block: model_AuthInfo.() -> Unit = {}) {
    if (user == null) {
        user = model_AuthInfo()
    }

    user.block()
}
