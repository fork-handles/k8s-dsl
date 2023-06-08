// GENERATED
package dev.forkhandles.k8s.extensions

import io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValue as extensions_HTTPIngressRuleValue
import io.fabric8.kubernetes.api.model.extensions.IngressRule as extensions_IngressRule

fun extensions_IngressRule.http(block: extensions_HTTPIngressRuleValue.() -> Unit = {}) {
    if (http == null) {
        http = extensions_HTTPIngressRuleValue()
    }

    http.block()
}
