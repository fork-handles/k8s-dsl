// GENERATE
package dev.forkhandles.k8s.storagemigration.v1alpha1

import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.GroupVersionResource as v1alpha1_GroupVersionResource
import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.MigrationCondition as v1alpha1_MigrationCondition
import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.StorageVersionMigration as v1alpha1_StorageVersionMigration
import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.StorageVersionMigrationList as v1alpha1_StorageVersionMigrationList
import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.StorageVersionMigrationSpec as v1alpha1_StorageVersionMigrationSpec
import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.StorageVersionMigrationStatus as v1alpha1_StorageVersionMigrationStatus

fun newGroupVersionResource(block: v1alpha1_GroupVersionResource.() -> Unit = {}): v1alpha1_GroupVersionResource {
    val instance = v1alpha1_GroupVersionResource()
    instance.block()
    return instance
}

fun newMigrationCondition(block: v1alpha1_MigrationCondition.() -> Unit = {}): v1alpha1_MigrationCondition {
    val instance = v1alpha1_MigrationCondition()
    instance.block()
    return instance
}

fun newStorageVersionMigration(block: v1alpha1_StorageVersionMigration.() -> Unit = {}): v1alpha1_StorageVersionMigration {
    val instance = v1alpha1_StorageVersionMigration()
    instance.block()
    return instance
}

fun newStorageVersionMigrationList(block: v1alpha1_StorageVersionMigrationList.() -> Unit = {}): v1alpha1_StorageVersionMigrationList {
    val instance = v1alpha1_StorageVersionMigrationList()
    instance.block()
    return instance
}

fun newStorageVersionMigrationSpec(block: v1alpha1_StorageVersionMigrationSpec.() -> Unit = {}): v1alpha1_StorageVersionMigrationSpec {
    val instance = v1alpha1_StorageVersionMigrationSpec()
    instance.block()
    return instance
}

fun newStorageVersionMigrationStatus(block: v1alpha1_StorageVersionMigrationStatus.() -> Unit = {}): v1alpha1_StorageVersionMigrationStatus {
    val instance = v1alpha1_StorageVersionMigrationStatus()
    instance.block()
    return instance
}
