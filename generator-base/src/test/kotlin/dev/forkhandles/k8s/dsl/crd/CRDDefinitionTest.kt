package dev.forkhandles.k8s.dsl.crd

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class CRDDefinitionTest {

    @Test
    fun testParsing() {
        val crd = CRDDefinition.parseFromResource("kafkaclusters-crd.json")

        crd.apiVersion shouldBe "apiextensions.k8s.io/v1beta1"
    }
}
