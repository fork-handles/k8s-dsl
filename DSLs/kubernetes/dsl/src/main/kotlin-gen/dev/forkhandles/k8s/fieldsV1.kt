// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.FieldsV1 as model_FieldsV1
import io.fabric8.kubernetes.api.model.ManagedFieldsEntry as model_ManagedFieldsEntry

fun model_ManagedFieldsEntry.fieldsV1(block: model_FieldsV1.() -> Unit = {}) {
    if (fieldsV1 == null) {
        fieldsV1 = model_FieldsV1()
    }

    fieldsV1.block()
}
