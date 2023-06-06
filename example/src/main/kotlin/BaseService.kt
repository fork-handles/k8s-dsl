import dev.forkhandles.k8s.metadata
import dev.forkhandles.k8s.newServicePort
import dev.forkhandles.k8s.spec
import io.fabric8.kubernetes.api.model.Service

open class BaseService(val serviceName: String) : Service() {
    companion object {
        val HTTP_PORT = 8080
        val GRPC_PORT = 8239
    }

    val grpcPort = GRPC_PORT
    val httpPort = HTTP_PORT

    init {
        metadata {
            name = serviceName
            labels = Defaults.labels(serviceName)
        }
        spec {
            type = "NodePort"
            ports = listOf(
                newServicePort {
                    name = "http"
                    protocol = "TCP"
                    port = httpPort
                },
                newServicePort {
                    name = "grpc"
                    port = grpcPort
                }
            )
            selector = Defaults.labels(serviceName)
        }
    }
}
