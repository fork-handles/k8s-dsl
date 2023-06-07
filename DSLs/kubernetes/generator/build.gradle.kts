plugins {
    application
    kotlin("jvm")
}

application {
    mainClass.set("dev.forkhandles.k8s.GeneratorKt")
}

tasks.named<JavaExec>("run").configure {
    args = listOf("${project(":DSLs:kubernetes:dsl").projectDir}/src/main/kotlin-gen/")

}

dependencies {
    implementation(project(":generator-base"))

    implementation(Kotlin.stdlib)
    implementation("org.jetbrains.kotlin:kotlin-reflect:_")

    implementation("io.fabric8:kubernetes-model:_")
}
