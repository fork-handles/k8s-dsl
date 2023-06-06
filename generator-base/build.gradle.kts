plugins {
    kotlin("jvm")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.21")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.21")

    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.google.guava:guava:32.0.0-jre")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.8.21")
}
