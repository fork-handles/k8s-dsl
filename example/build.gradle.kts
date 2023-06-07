plugins {
    application
    kotlin("jvm")
}

application.mainClass.set("ExampleKt")

dependencies {
    implementation(project(":DSLs:kubernetes:dsl"))

    implementation(Kotlin.stdlib)
    implementation("org.jetbrains.kotlin:kotlin-reflect:_")

    implementation("io.fabric8:kubernetes-client:_")

    testImplementation("com.google.code.gson:gson:_")
    testImplementation("com.google.guava:guava:_")

    testImplementation(Testing.junit4)
    testImplementation(Kotlin.test.junit)
}
