// GENERATED
package dev.forkhandles.k8s.authentication

import io.fabric8.kubernetes.api.model.authentication.TokenReviewStatus as authentication_TokenReviewStatus
import io.fabric8.kubernetes.api.model.authentication.UserInfo as authentication_UserInfo

fun authentication_TokenReviewStatus.user(block: authentication_UserInfo.() -> Unit = {}) {
    if (user == null) {
        user = authentication_UserInfo()
    }

    user.block()
}
