import dev.forkhandles.k8s.networking.v1.defaultBackend
import dev.forkhandles.k8s.networking.v1.metadata
import dev.forkhandles.k8s.networking.v1.newIngress
import dev.forkhandles.k8s.networking.v1.newServiceBackendPort
import dev.forkhandles.k8s.networking.v1.service
import dev.forkhandles.k8s.networking.v1.spec
import io.fabric8.kubernetes.client.ConfigBuilder
import io.fabric8.kubernetes.client.KubernetesClientBuilder

fun main() {
    val client = KubernetesClientBuilder()
        .withConfig(ConfigBuilder().withNamespace("default").build())
        .build()

    client.network().v1().ingresses().resource(
        newIngress {
            metadata {
                name = "example-ingress"
            }
            spec {
                defaultBackend {
                    service {
                        name = "example-service"
                        port = newServiceBackendPort {
                            number = 8080
                        }
                    }
                }
            }
        }
    ).serverSideApply()
}
