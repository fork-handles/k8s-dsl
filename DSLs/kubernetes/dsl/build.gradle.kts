plugins {
    kotlin("jvm")
    `java-library`
    `maven-publish`
    signing
}

buildscript {
    repositories {
        mavenCentral()
    }
}

val sourcesJar by tasks.creating(Jar::class) {
    archiveClassifier.set("sources")
    from(project.the<SourceSetContainer>()["main"].allSource)
    dependsOn(tasks.named("classes"))
}

val javadocJar by tasks.creating(Jar::class) {
    archiveClassifier.set("javadoc")
    from(tasks.named<Javadoc>("javadoc").get().destinationDir)
    dependsOn(tasks.named("javadoc"))
}

tasks.named<Jar>("jar") {
    manifest {
        attributes(mapOf("version" to archiveVersion))
    }
}

val testJar by tasks.creating(Jar::class) {
    archiveClassifier.set("test")
    from(project.the<SourceSetContainer>()["test"].output)
}

configurations.create("testArtifacts") {
    extendsFrom(configurations["testApi"])
}

artifacts {
    add("testArtifacts", testJar)
    archives(sourcesJar)
    archives(javadocJar)
}

val enableSigning = project.findProperty("sign") == "true"

if (enableSigning) { // when added it expects signing keys to be configured
    signing {
        val signingKey: String? by project
        val signingPassword: String? by project
        useInMemoryPgpKeys(signingKey, signingPassword)
        sign(publishing.publications)
    }
}

version = project.properties["releaseVersion"] ?: "LOCAL"
group = "dev.forkhandles"
description = "Kotlin DSL for Kubernetes manifests"

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifactId = "k8s-dsl"
            version = "current_k8s_dsl_version"
            pom.withXml {
                asNode().appendNode("name", artifactId)
                asNode().appendNode("description", description)
                asNode().appendNode("url", "https://forkhandles.dev")
                asNode().appendNode("developers")
                    .appendNode("developer").appendNode("name", "Franck Rasolo").parent()
                    .appendNode("email", "franck@forkhandles.dev")
                    .parent().parent()
                    .appendNode("developer").appendNode("name", "David Denton").parent()
                    .appendNode("email", "david@forkhandles.dev")
                asNode().appendNode("scm")
                    .appendNode("url", "https://github.com/fork-handles/k8s-dsl").parent()
                    .appendNode("connection", "scm:git:git@github.com:fork-handles/k8s-dsl.git").parent()
                    .appendNode("developerConnection", "scm:git:git@github.com:fork-handles/k8s-dsl.git")
                asNode().appendNode("licenses").appendNode("license")
                    .appendNode("name", "Apache License, Version 2.0").parent()
                    .appendNode("url", "http://www.apache.org/licenses/LICENSE-2.0.html")
            }
            from(components["java"])

            artifact(sourcesJar)
            artifact(javadocJar)
            artifact(testJar)
        }
    }
}

sourceSets.main {
    kotlin.srcDir("src/main/kotlin-gen")
}

dependencies {
    implementation(Kotlin.stdlib)
    implementation("org.jetbrains.kotlin:kotlin-reflect:_")

    api("io.fabric8:kubernetes-model:_")

    testImplementation(Testing.junit4)
    testImplementation(Kotlin.test.junit)
}
