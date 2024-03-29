[![CI: GitHub Actions](https://github.com/fork-handles/k8s-dsl/workflows/CI/badge.svg)](https://github.com/fork-handles/k8s-dsl/actions?query=workflow%3A%22CI%22)
[![CI: Cirrus CI](https://img.shields.io/cirrus/github/fork-handles/k8s-dsl?label=CI&logo=cirrus-ci&logoColor=959DA5)](https://cirrus-ci.com/github/fork-handles/k8s-dsl)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue)](https://github.com/fork-handles/k8s-dsl/blob/trunk/LICENSE)

[Kotlin](https://kotlinlang.org) DSL for [Kubernetes](https://kubernetes.io/) generated on top of
the [fabric8 client](https://github.com/fabric8io/kubernetes-client).

![screencast](demo.gif)

## Usage

The `k8s-dsl` library is published to Maven Central. Simply add the following line to your project's
`dependencies` block:

 ```kotlin
api("dev.forkhandles:k8s-dsl:3.5.0.0")
```

### Using with `kubernetes-client`

Let's check out how to create an Ingress via [fabric8 client](https://github.com/fabric8io/kubernetes-client).
Don't forget to add a dependency on `io.fabric8:kubernetes-client:${kubernetes_client_version}`.

```kotlin
import dev.forkhandles.k8s.extensions.backend
import dev.forkhandles.k8s.extensions.metadata
import dev.forkhandles.k8s.extensions.newIngress
import dev.forkhandles.k8s.extensions.spec
import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.kubernetes.client.DefaultKubernetesClient


fun main() {
    val client = KubernetesClientBuilder()
        .withConfig(ConfigBuilder().withNamespace("default").build())
        .build()

    client.extensions().ingresses().resource(
        newIngress {
            metadata {
                name = "example-ingress"
            }
            spec {
                backend {
                    serviceName = "example-service"
                    servicePort = IntOrString(8080)
                }
            }
        }
    ).serverSideApply()
}
```

### Apply modifications

By leveraging awesomeness of Kotlin it becomes super easy to have a base service template that every microservice
is created from:

```kotlin
val baseService = defaultServiceTemplate()
baseService.apply {
    metadata {
        name = "foo"
    }
}
```

### Complete Deployment example

Here is an example of `BaseDeployment` that defines a deployment with one replica and mounts a secret that can be used
by the service.

```kotlin
import dev.forkhandles.k8s.apps.metadata
import dev.forkhandles.k8s.apps.spec
import dev.forkhandles.k8s.apps.template
import dev.forkhandles.k8s.httpGet
import dev.forkhandles.k8s.livenessProbe
import dev.forkhandles.k8s.metadata
import dev.forkhandles.k8s.newContainer
import dev.forkhandles.k8s.newContainerPort
import dev.forkhandles.k8s.newEnvVar
import dev.forkhandles.k8s.newVolume
import dev.forkhandles.k8s.newVolumeMount
import dev.forkhandles.k8s.readinessProbe
import dev.forkhandles.k8s.secret
import dev.forkhandles.k8s.spec
import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.kubernetes.api.model.apps.Deployment

class BaseDeployment : Deployment {
    constructor(serviceName: String) {
        metadata {
            name = "$serviceName-service-deployment"
            labels = mapOf(
                "app" to serviceName,
                "tier" to "backend"
            )
        }
        spec {
            replicas = 1
            template {
                metadata {
                    labels = mapOf(
                        "app" to serviceName,
                        "tier" to "backend"
                    )
                }
                spec {
                    containers = listOf(
                        newContainer {
                            name = "$serviceName-service"
                            image = "gcr.io/fork-handles/$serviceName-service:latest"
                            volumeMounts = listOf(
                                newVolumeMount {
                                    name = "gcp-credentials"
                                    mountPath = "/etc/credentials"
                                    readOnly = true
                                }
                            )
                            env = listOf(
                                newEnvVar {
                                    name = "GOOGLE_APPLICATION_CREDENTIALS"
                                    value = "/etc/credentials/service-account-credentials.json"
                                }
                            )
                            ports = listOf(
                                newContainerPort {
                                    containerPort = 8080
                                }
                            )
                            livenessProbe {
                                httpGet {
                                    path = "/healthz"
                                    port = IntOrString(8080)
                                }
                                periodSeconds = 60
                            }
                            readinessProbe {
                                httpGet {
                                    path = "/healthz"
                                    port = IntOrString(8080)
                                }
                                initialDelaySeconds = 10
                                periodSeconds = 60
                            }
                        }
                    )
                    volumes = listOf(
                        newVolume {
                            name = "gcp-credentials"
                            secret {
                                secretName = "gcp-credentials"
                            }
                        }
                    )
                }
            }
        }
    }
}
```

## Contribution

Check `CONTRIBUTING.md`
