// GENERATED
package dev.forkhandles.k8s.storage

import io.fabric8.kubernetes.api.model.storage.VolumeAttachment as storage_VolumeAttachment
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentStatus as storage_VolumeAttachmentStatus


fun storage_VolumeAttachment.status(block: storage_VolumeAttachmentStatus.() -> Unit = {}) {
    if (this.status == null) {
        this.status = storage_VolumeAttachmentStatus()
    }

    this.status!!.block()
}

