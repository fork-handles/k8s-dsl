rootProject.name = "k8s-dsl"

rootDir.walkTopDown()
    .filter { it.isDirectory && File(it, "build.gradle.kts").exists() }
    .map { it.relativeTo(rootDir).path.replace('/', ':') }
    .forEach { include(it) }
