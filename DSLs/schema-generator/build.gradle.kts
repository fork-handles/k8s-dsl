plugins {
    application
    kotlin("jvm")
}

application.mainClass.set("dev.forkhandles.k8s.GeneratorKt")

dependencies {
    implementation(project(":generator-base"))

    implementation("com.google.code.gson:gson:_")
    implementation("com.google.code.gson:gson-extras:_")

    implementation(Kotlin.stdlib)
    implementation("org.jetbrains.kotlin:kotlin-reflect:_")

    implementation("io.fabric8:kubernetes-client:_")
    implementation("io.fabric8:kubernetes-model:_")
}
