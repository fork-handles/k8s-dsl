// GENERATED
package dev.forkhandles.k8s.autoscaling.v2beta2

import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.CrossVersionObjectReference as v2beta2_CrossVersionObjectReference
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ObjectMetricSource as v2beta2_ObjectMetricSource
import io.fabric8.kubernetes.api.model.autoscaling.v2beta2.ObjectMetricStatus as v2beta2_ObjectMetricStatus

fun v2beta2_ObjectMetricSource.describedObject(block: v2beta2_CrossVersionObjectReference.() -> Unit = {}) {
    if (describedObject == null) {
        describedObject = v2beta2_CrossVersionObjectReference()
    }

    describedObject.block()
}

fun v2beta2_ObjectMetricStatus.describedObject(block: v2beta2_CrossVersionObjectReference.() -> Unit = {}) {
    if (describedObject == null) {
        describedObject = v2beta2_CrossVersionObjectReference()
    }

    describedObject.block()
}
