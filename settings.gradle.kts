pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    plugins {
        id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention")
    id("de.fayard.refreshVersions").version("0.51.0")
}

rootProject.name = "k8s-dsl"

rootDir.walkTopDown()
    .filter { it.isDirectory && File(it, "build.gradle.kts").exists() }
    .map { it.relativeTo(rootDir).path.replace('/', ':') }
    .forEach { include(it) }

gradle.startParameter.isContinueOnFailure = true
