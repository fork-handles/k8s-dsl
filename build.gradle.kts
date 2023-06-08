import org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
import org.gradle.internal.impldep.org.bouncycastle.cms.RecipientId.password
import org.gradle.jvm.toolchain.JvmVendorSpec.ADOPTIUM
import org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_1_8
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_1_8
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask
import java.time.Duration

plugins {
    java
    jacoco
    kotlin("jvm")
    id("io.github.gradle-nexus.publish-plugin") version "1.3.0"
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
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
                apiVersion.set(KOTLIN_1_8)
                languageVersion.set(KOTLIN_1_8)
                allWarningsAsErrors.set(true)
                freeCompilerArgs.addAll("-Xjsr305=strict", "-progressive")
            }
        }

        withType<JavaCompile>().configureEach {
            options.release.set(8)
            options.compilerArgs.addAll(arrayOf("-Xlint:all:_", "-Werror"))
        }

        named<Test>("test").configure {
            testLogging {
                exceptionFormat = FULL
            }
        }

        named<JacocoReport>("jacocoTestReport").configure {
            group = "Reporting"
            reports {
                xml.required.set(true)
                csv.required.set(false)
            }
        }
    }
}

val nexusUsername: String? by project
val nexusPassword: String? by project

nexusPublishing {
    repositories {
        sonatype {
            username.set(nexusUsername)
            password.set(nexusPassword)
        }
    }
    transitionCheckOptions {
        maxRetries.set(150)
        delayBetween.set(Duration.ofSeconds(5))
    }
}
