// GENERATED
package dev.forkhandles.k8s.storage

import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentSource as storage_VolumeAttachmentSource

fun storage_VolumeAttachmentSource.inlineVolumeSpec(block: model_PersistentVolumeSpec.() -> Unit = {}) {
    if (inlineVolumeSpec == null) {
        inlineVolumeSpec = model_PersistentVolumeSpec()
    }

    inlineVolumeSpec.block()
}
