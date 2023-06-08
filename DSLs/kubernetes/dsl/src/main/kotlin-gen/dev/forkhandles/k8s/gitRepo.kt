// GENERATED
package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.GitRepoVolumeSource as model_GitRepoVolumeSource
import io.fabric8.kubernetes.api.model.Volume as model_Volume

fun model_Volume.gitRepo(block: model_GitRepoVolumeSource.() -> Unit = {}) {
    if (gitRepo == null) {
        gitRepo = model_GitRepoVolumeSource()
    }

    gitRepo.block()
}
