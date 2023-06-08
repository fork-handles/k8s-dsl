// GENERATED
package dev.forkhandles.k8s.storage

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.storage.CSIDriver as storage_CSIDriver
import io.fabric8.kubernetes.api.model.storage.CSIDriverList as storage_CSIDriverList
import io.fabric8.kubernetes.api.model.storage.CSINode as storage_CSINode
import io.fabric8.kubernetes.api.model.storage.CSINodeList as storage_CSINodeList
import io.fabric8.kubernetes.api.model.storage.CSIStorageCapacity as storage_CSIStorageCapacity
import io.fabric8.kubernetes.api.model.storage.CSIStorageCapacityList as storage_CSIStorageCapacityList
import io.fabric8.kubernetes.api.model.storage.StorageClass as storage_StorageClass
import io.fabric8.kubernetes.api.model.storage.StorageClassList as storage_StorageClassList
import io.fabric8.kubernetes.api.model.storage.VolumeAttachment as storage_VolumeAttachment
import io.fabric8.kubernetes.api.model.storage.VolumeAttachmentList as storage_VolumeAttachmentList

fun storage_CSIDriver.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun storage_CSIDriverList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun storage_CSINode.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun storage_CSINodeList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun storage_CSIStorageCapacity.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun storage_CSIStorageCapacityList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun storage_StorageClass.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun storage_StorageClassList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}

fun storage_VolumeAttachment.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun storage_VolumeAttachmentList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
