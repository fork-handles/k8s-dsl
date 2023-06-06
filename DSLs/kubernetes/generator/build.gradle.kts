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

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.21")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.21")

    implementation("io.fabric8:kubernetes-model:6.7.0")
}
