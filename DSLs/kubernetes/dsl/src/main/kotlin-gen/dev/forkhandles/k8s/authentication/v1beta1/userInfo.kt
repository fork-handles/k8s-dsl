// GENERATED
package dev.forkhandles.k8s.authentication.v1beta1

import io.fabric8.kubernetes.api.model.authentication.UserInfo as authentication_UserInfo
import io.fabric8.kubernetes.api.model.authentication.v1beta1.SelfSubjectReviewStatus as v1beta1_SelfSubjectReviewStatus

fun v1beta1_SelfSubjectReviewStatus.userInfo(block: authentication_UserInfo.() -> Unit = {}) {
    if (userInfo == null) {
        userInfo = authentication_UserInfo()
    }

    userInfo.block()
}
