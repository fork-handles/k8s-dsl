// GENERATED
package dev.forkhandles.k8s.storage.v1alpha1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.storage.v1alpha1.VolumeAttributesClass as v1alpha1_VolumeAttributesClass
import io.fabric8.kubernetes.api.model.storage.v1alpha1.VolumeAttributesClassList as v1alpha1_VolumeAttributesClassList

fun v1alpha1_VolumeAttributesClass.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1alpha1_VolumeAttributesClassList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
