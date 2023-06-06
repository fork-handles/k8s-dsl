plugins {
    application
    kotlin("jvm")
}

application.mainClass.set("ExampleKt")

dependencies {
    implementation(project(":DSLs:kubernetes:dsl"))

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.21")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.21")

    implementation("io.fabric8:kubernetes-client:6.7.0")

    testImplementation("com.google.code.gson:gson:2.10.1")
    testImplementation("com.google.guava:guava:32.0.0-jre")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.8.21")
}
