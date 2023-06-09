// GENERATED
package dev.forkhandles.k8s.certificates.v1beta1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.kubernetes.api.model.certificates.v1beta1.CertificateSigningRequest as v1beta1_CertificateSigningRequest
import io.fabric8.kubernetes.api.model.certificates.v1beta1.CertificateSigningRequestList as v1beta1_CertificateSigningRequestList

fun v1beta1_CertificateSigningRequest.metadata(block: model_ObjectMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ObjectMeta()
    }

    metadata.block()
}

fun v1beta1_CertificateSigningRequestList.metadata(block: model_ListMeta.() -> Unit = {}) {
    if (metadata == null) {
        metadata = model_ListMeta()
    }

    metadata.block()
}
