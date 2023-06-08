// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.Config as model_Config
import io.fabric8.kubernetes.api.model.Preferences as model_Preferences

fun model_Config.preferences(block: model_Preferences.() -> Unit = {}) {
    if (preferences == null) {
        preferences = model_Preferences()
    }

    preferences.block()
}
