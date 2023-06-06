plugins {
    application
    kotlin("jvm")
}

application.mainClass.set("com.fkorotkov.kubernetes.GeneratorKt")

dependencies {
    implementation(project(":generator-base"))

    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.google.code.gson:gson-extras:2.8.5")

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.21")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.21")

    implementation("io.fabric8:kubernetes-client:6.7.0")
    implementation("io.fabric8:kubernetes-model:6.7.0")
}
