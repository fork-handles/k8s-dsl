// GENERATED
package dev.forkhandles.k8s.storage

import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentStatus as storage_VolumeAttachmentStatus
import io.fabric8.kubernetes.api.model.storage.VolumeError as storage_VolumeError

fun storage_VolumeAttachmentStatus.attachError(block: storage_VolumeError.() -> Unit = {}) {
    if (attachError == null) {
        attachError = storage_VolumeError()
    }

    attachError.block()
}
