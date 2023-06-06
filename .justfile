_targets:
  @just --list --unsorted --list-heading $'Available targets:\n' --list-prefix "  "

# updates all libraries declared in dependencies.json
@versions:
  ./gradlew updateLibraries
