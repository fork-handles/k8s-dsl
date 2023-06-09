// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.AuthInfo as model_AuthInfo
import io.fabric8.kubernetes.api.model.AuthProviderConfig as model_AuthProviderConfig

fun model_AuthInfo.authProvider(block: model_AuthProviderConfig.() -> Unit = {}) {
    if (authProvider == null) {
        authProvider = model_AuthProviderConfig()
    }

    authProvider.block()
}
