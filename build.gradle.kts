import org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL

plugins {
    java
    jacoco
    kotlin("jvm") version "1.8.21"
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
        vendor.set(JvmVendorSpec.ADOPTIUM)
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

//    sourceCompatibility = 1.8
//    targetCompatibility = 1.8

    tasks {
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
