export GRADLE_OPTS := "-Dorg.gradle.warning.mode=fail -Dorg.gradle.logging.stacktrace=all"

_targets:
  @just --list --unsorted --list-heading $'Available targets:\n' --list-prefix "  "

# checks Nix flake inputs
@check-flake:
  nix run "github:DeterminateSystems/flake-checker"

# updates the top-level flake lock file
@update-flake:
  nix flake update --commit-lock-file --commit-lockfile-summary "update Nix flake inputs"

# upgrades dependencies across all Gradle projects
@versions:
  ./gradlew refreshVersionsMigrate --mode=VersionsPropertiesOnly && ./gradlew refreshVersions

# generates the latest k8s DSL from fabric8
@generate:
  ./gradlew :DSLs:kubernetes:generator:run

# runs tests across all sub-projects
@check:
  ./gradlew check
