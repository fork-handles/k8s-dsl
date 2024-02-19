// GENERATE
package dev.forkhandles.k8s.storage.v1alpha1

import io.fabric8.kubernetes.api.model.storage.v1alpha1.VolumeAttributesClass as v1alpha1_VolumeAttributesClass
import io.fabric8.kubernetes.api.model.storage.v1alpha1.VolumeAttributesClassList as v1alpha1_VolumeAttributesClassList

fun newVolumeAttributesClass(block: v1alpha1_VolumeAttributesClass.() -> Unit = {}): v1alpha1_VolumeAttributesClass {
    val instance = v1alpha1_VolumeAttributesClass()
    instance.block()
    return instance
}

fun newVolumeAttributesClassList(block: v1alpha1_VolumeAttributesClassList.() -> Unit = {}): v1alpha1_VolumeAttributesClassList {
    val instance = v1alpha1_VolumeAttributesClassList()
    instance.block()
    return instance
}
