// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.ServiceAccountTokenProjection as model_ServiceAccountTokenProjection
import io.fabric8.kubernetes.api.model.VolumeProjection as model_VolumeProjection

fun model_VolumeProjection.serviceAccountToken(block: model_ServiceAccountTokenProjection.() -> Unit = {}) {
    if (serviceAccountToken == null) {
        serviceAccountToken = model_ServiceAccountTokenProjection()
    }

    serviceAccountToken.block()
}
