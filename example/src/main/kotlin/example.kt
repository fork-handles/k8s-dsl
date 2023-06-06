import com.fkorotkov.kubernetes.extensions.backend
import com.fkorotkov.kubernetes.extensions.metadata
import com.fkorotkov.kubernetes.extensions.newIngress
import com.fkorotkov.kubernetes.extensions.spec
import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.kubernetes.client.ConfigBuilder
import io.fabric8.kubernetes.client.KubernetesClientBuilder

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
