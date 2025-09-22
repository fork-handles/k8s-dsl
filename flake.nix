{
  description = "Nix flake for k8s-dsl";
  inputs.nixpkgs.url = "github:NixOS/nixpkgs/nixpkgs-unstable";
  inputs.flake-utils.url = "github:numtide/flake-utils";

  outputs = { self, nixpkgs, flake-utils }:
    flake-utils.lib.eachDefaultSystem (system: let
      pkgs = nixpkgs.legacyPackages.${system};
    in {
      devShells.default = pkgs.mkShell rec {
        packages = with pkgs; [
          direnv
          jq
          just
          k3d
          k9s
          kubectl
          kubectl-explore
          kubectx
          temurin-bin-21
          tokei
          yq-go
        ];

        shellHook = ''
          # health checks for Nix flake inputs
          nix run "github:DeterminateSystems/flake-checker"
        '';
      };
    });
}
