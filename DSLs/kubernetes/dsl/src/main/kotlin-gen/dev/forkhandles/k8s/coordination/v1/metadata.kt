// GENERATED
package dev.forkhandles.k8s.coordination.v1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.coordination.v1.Lease as v1_Lease
import io.fabric8.kubernetes.api.model.coordination.v1.LeaseList as v1_LeaseList


fun v1_Lease.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (this.metadata == null) {
        this.metadata = model_ObjectMeta()
    }

    this.metadata!!.block()
}


fun v1_LeaseList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (this.metadata == null) {
        this.metadata = model_ListMeta()
    }

    this.metadata!!.block()
}

