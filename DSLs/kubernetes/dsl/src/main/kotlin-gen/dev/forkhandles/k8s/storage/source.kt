// GENERATED
package dev.forkhandles.k8s.storage

import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentSource as storage_VolumeAttachmentSource
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentSpec as storage_VolumeAttachmentSpec

fun storage_VolumeAttachmentSpec.source(block: storage_VolumeAttachmentSource.() -> Unit = {}) {
    if (source == null) {
        source = storage_VolumeAttachmentSource()
    }

    source.block()
}
