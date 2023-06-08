// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta1

import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.CrossVersionObjectReference as v2beta1_CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ObjectMetricSource as v2beta1_ObjectMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.ObjectMetricStatus as v2beta1_ObjectMetricStatus

fun v2beta1_ObjectMetricSource.target(block: v2beta1_CrossVersionObjectReference.() -> Unit = {}) {
    if (target == null) {
        target = v2beta1_CrossVersionObjectReference()
    }

    target.block()
}

fun v2beta1_ObjectMetricStatus.target(block: v2beta1_CrossVersionObjectReference.() -> Unit = {}) {
    if (target == null) {
        target = v2beta1_CrossVersionObjectReference()
    }

    target.block()
}
