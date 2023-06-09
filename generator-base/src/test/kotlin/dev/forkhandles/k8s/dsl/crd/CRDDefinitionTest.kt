package dev.forkhandles.k8s.dsl.crd

import org.junit.Test
import kotlin.test.assertEquals

class CRDDefinitionTest {
    @Test
    fun testParsing() {
        val crd = CRDDefinition.parseFromResource("kafkaclusters-crd.json")
        assertEquals("apiextensions.k8s.io/v1beta1", crd.apiVersion)
    }
}
