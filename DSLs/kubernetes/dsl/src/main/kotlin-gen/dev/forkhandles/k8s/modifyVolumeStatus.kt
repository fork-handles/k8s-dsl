// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ModifyVolumeStatus as model_ModifyVolumeStatus
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimStatus as model_PersistentVolumeClaimStatus

fun model_PersistentVolumeClaimStatus.modifyVolumeStatus(block: model_ModifyVolumeStatus.() -> Unit = {}) {
    if (modifyVolumeStatus == null) {
        modifyVolumeStatus = model_ModifyVolumeStatus()
    }

    modifyVolumeStatus.block()
}
