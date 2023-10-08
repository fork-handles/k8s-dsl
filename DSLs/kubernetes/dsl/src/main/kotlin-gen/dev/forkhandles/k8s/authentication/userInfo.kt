// GENERATED
package dev.forkhandles.k8s.authentication

import io.fabric8.kubernetes.api.model.authentication.SelfSubjectReviewStatus as authentication_SelfSubjectReviewStatus
import io.fabric8.kubernetes.api.model.authentication.UserInfo as authentication_UserInfo

fun authentication_SelfSubjectReviewStatus.userInfo(block: authentication_UserInfo.() -> Unit = {}) {
    if (userInfo == null) {
        userInfo = authentication_UserInfo()
    }

    userInfo.block()
}
