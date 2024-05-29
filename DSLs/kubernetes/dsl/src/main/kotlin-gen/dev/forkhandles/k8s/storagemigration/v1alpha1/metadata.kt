// GENERATED
package dev.forkhandles.k8s.storagemigration.v1alpha1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.StorageVersionMigration as v1alpha1_StorageVersionMigration
import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.StorageVersionMigrationList as v1alpha1_StorageVersionMigrationList

fun v1alpha1_StorageVersionMigration.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1alpha1_StorageVersionMigrationList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
