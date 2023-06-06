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
            labels = Defaults.labels(serviceName)
        }
        spec {
            replicas = 1
            template {
                metadata {
                    labels = Defaults.labels(serviceName)
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
                                    name = "http"
                                    containerPort = BaseService.HTTP_PORT
                                    protocol = "TCP"
                                },
                                newContainerPort {
                                    name = "grpc"
                                    containerPort = BaseService.GRPC_PORT
                                    protocol = "TCP"
                                }
                            )
                            livenessProbe {
                                httpGet {
                                    path = "/healthz"
                                    port = IntOrString(BaseService.HTTP_PORT)
                                }
                                periodSeconds = 60
                            }
                            readinessProbe {
                                httpGet {
                                    path = "/healthz"
                                    port = IntOrString(BaseService.HTTP_PORT)
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
