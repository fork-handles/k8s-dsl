{
  description = "Nix flake for k8s-dsl";
  inputs.nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
  inputs.flake-utils.url = "github:numtide/flake-utils";

  outputs = { self, nixpkgs, flake-utils }:
    flake-utils.lib.eachDefaultSystem (system: let
      pkgs = nixpkgs.legacyPackages.${system};
    in {
      devShells.default = pkgs.mkShell rec {
        packages = with pkgs; [
          direnv
          just
          k3d
          kubectl
          kubectx
          temurin-bin-21
        ];

        shellHook = ''
          # health checks for Nix flake inputs
          nix run "github:DeterminateSystems/flake-checker"
        '';
      };
    });
}
