plugins {
    application
    kotlin("jvm")
}

application {
    mainClass.set("dev.forkhandles.k8s.GeneratorKt")
}

tasks.named<JavaExec>("run").configure {
    args = listOf("${projects.dsLs.kubernetes.dsl.dependencyProject.projectDir}/src/main/kotlin-gen/")
}

dependencies {
    implementation(projects.generatorBase)

    implementation(Kotlin.stdlib)
    implementation("org.jetbrains.kotlin:kotlin-reflect:_")

    implementation("io.fabric8:kubernetes-model:_")
}
