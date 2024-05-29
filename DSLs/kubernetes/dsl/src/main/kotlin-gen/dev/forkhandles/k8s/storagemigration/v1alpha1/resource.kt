// GENERATED
package dev.forkhandles.k8s.storagemigration.v1alpha1

import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.GroupVersionResource as v1alpha1_GroupVersionResource
import io.fabric8.kubernetes.api.model.storagemigration.v1alpha1.StorageVersionMigrationSpec as v1alpha1_StorageVersionMigrationSpec

fun v1alpha1_StorageVersionMigrationSpec.resource(block: v1alpha1_GroupVersionResource.() -> Unit = {}) {
    if (resource == null) {
        resource = v1alpha1_GroupVersionResource()
    }

    resource.block()
}
