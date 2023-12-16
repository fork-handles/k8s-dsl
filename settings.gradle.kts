pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    plugins {
        id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention")
    id("de.fayard.refreshVersions").version("0.60.3")
}

rootProject.name = "k8s-dsl"

rootDir.walkTopDown()
    .filter { it.isDirectory && File(it, "build.gradle.kts").exists() }
    .filterNot { it.path.contains(".direnv") }
    .map { it.relativeTo(rootDir).path.replace('/', ':') }
    .forEach { include(it) }

gradle.startParameter.isContinueOnFailure = true

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
