plugins {
    kotlin("jvm")
    `maven-publish`
}

buildscript {
    repositories {
        mavenCentral()
    }
}

val sourcesJar by tasks.creating(Jar::class) {
    from(project.the<SourceSetContainer>()["main"].allSource)
    archiveClassifier.set("sources")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = "dev.forkhandles"
            artifactId = "k8s-dsl"
            version = "current_k8s_dsl_version"
            from(components["java"])
            artifact(sourcesJar)
        }
    }
}

sourceSets.main {
    kotlin.srcDir("src/main/kotlin-gen")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.21")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.21")

    api("io.fabric8:kubernetes-model:6.7.0")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.8.21")
}
