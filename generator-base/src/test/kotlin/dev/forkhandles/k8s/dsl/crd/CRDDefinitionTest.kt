package dev.forkhandles.k8s.dsl.crd

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CRDDefinitionTest {

    @Test
    fun testParsing() {
        val crd = CRDDefinition.parseFromResource("kafkaclusters-crd.json")
        assertEquals("apiextensions.k8s.io/v1beta1", crd.apiVersion)
    }
}
