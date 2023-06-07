plugins {
    kotlin("jvm")
}

dependencies {
    implementation(Kotlin.stdlib)
    implementation("org.jetbrains.kotlin:kotlin-reflect:_")

    implementation("com.google.code.gson:gson:_")
    implementation("com.google.guava:guava:_")

    testImplementation(Testing.junit4)
    testImplementation(Kotlin.test.junit)
}
