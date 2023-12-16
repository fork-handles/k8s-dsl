_targets:
  @just --list --unsorted --list-heading $'Available targets:\n' --list-prefix "  "

# creates the k3s cluster
@create:
  k3d cluster create --config k3d-config.yaml

# deletes the k3d cluster
@delete:
  k3d cluster delete --config k3d-config.yaml
