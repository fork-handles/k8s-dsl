import org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
import org.gradle.jvm.toolchain.JvmVendorSpec.ADOPTIUM
import org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_1_8
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_2
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask
import java.time.Duration

plugins {
    java
    jacoco
    kotlin("jvm")
    id("io.github.gradle-nexus.publish-plugin")
}

tasks.wrapper {
    gradleVersion = "9.0.0"
    distributionSha256Sum = "f759b8dd5204e2e3fa4ca3e73f452f087153cf81bac9561eeb854229cc2c5365"
    distributionType = Wrapper.DistributionType.ALL
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
        vendor.set(ADOPTIUM)
    }
}

repositories {
    mavenCentral()
}

subprojects {

    repositories {
        mavenLocal()
        mavenCentral()
        maven(url = "https://repo.gradle.org/gradle/repo")
        maven(url = "https://artifactory.cronapp.io/public-release")
    }

    apply(plugin = "java")
    apply(plugin = "jacoco")
    apply(plugin = "maven-publish") // required to upload to sonatype

    tasks {
        withType<KotlinCompilationTask<KotlinJvmCompilerOptions>>().configureEach {
            compilerOptions {
                jvmTarget.set(JVM_1_8)
                apiVersion.set(KOTLIN_2_2)
                languageVersion.set(KOTLIN_2_2)
                allWarningsAsErrors.set(true)
                freeCompilerArgs.addAll("-Xjsr305=strict", "-progressive")
            }
        }

        withType<JavaCompile>().configureEach {
            options.release.set(8)
            options.compilerArgs.addAll(arrayOf("-Xlint:all:_", "-Werror"))
        }

        @Suppress("UnstableApiUsage")
        testing {
            suites {
                named<JvmTestSuite>("test") {
                    useJUnitJupiter("5.10.0")

                    dependencies {
                        implementation(Testing.kotest.assertions.core)
                    }

                    targets.all {
                        testTask.configure {
                            testLogging {
                                exceptionFormat = FULL
                            }
                        }
                    }
                }
            }
        }

        named<JacocoReport>("jacocoTestReport").configure {
            group = "Reporting"
            reports {
                xml.required.set(true)
                csv.required.set(false)
            }
        }

        register("listProjects") {
            doLast {
                subprojects
                    .forEach { System.err.println(it.name) }
            }
        }
    }
}

val nexusUsername: String? by project
val nexusPassword: String? by project

version = project.properties["releaseVersion"] ?: "LOCAL"
group = "dev.forkhandles"
description = "Kotlin DSL for Kubernetes manifests"

nexusPublishing {
    repositories.sonatype {
        username.set(nexusUsername)
        password.set(nexusPassword)
    }
    transitionCheckOptions {
        maxRetries.set(150)
        delayBetween.set(Duration.ofSeconds(5))
    }
}
