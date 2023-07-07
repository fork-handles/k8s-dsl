package dev.forkhandles.k8s

import io.fabric8.kubernetes.api.model.IntOrString
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class SimpleCompilationTest {

    @Test
    fun testService() {
        val serviceName = "test"

        val myService = newService {
            metadata {
                name = serviceName
                labels = mapOf(
                    "app" to serviceName,
                    "tier" to "backend"
                )
            }
            spec {
                type = "NodePort"
                ports = listOf(
                    newServicePort {
                        name = "http"
                        port = 8080
                        targetPort = IntOrString(8080)
                    },
                    newServicePort {
                        name = "grcp"
                        port = 8239
                        targetPort = IntOrString(8239)
                    }
                )
                selector = mapOf(
                    "app" to serviceName,
                    "tier" to "backend"
                )
            }
        }

        myService.metadata.name shouldBe serviceName
        myService.spec.type shouldBe "NodePort"

        myService.apply {
            metadata {
                name = "foo"
            }
        }
        myService.metadata.name shouldBe "foo"
    }
}
