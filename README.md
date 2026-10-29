# Create: Diamonds Galore

A NeoForge addon starter project for Minecraft 1.21.1, Create 6, and Create Aeronautics.

## Requirements

- Java 21
- An internet connection for Gradle to download Minecraft, NeoForge, and mod dependencies

## Development

- `./gradlew runClient` launches a development client with Create, Create Aeronautics, and Sable.
- `./gradlew runServer` launches a development server with those mods.
- `./gradlew build` builds the addon JAR in `build/libs/`.
- `./gradlew runData` generates data resources.

The starter mod entry point is `src/main/java/com/maxdiamondsgalore/DiamondsGalore.java`. Mod metadata and required dependency versions are in `src/main/resources/META-INF/neoforge.mods.toml`.

Example recipes are in `src/main/resources/data/diamonds_galore/recipe/`, organized by recipe type. They are real recipes and load in-game; replace or remove them as you add your own content.

The local Git repository is initialized on `main`. To publish it on GitHub, create an empty GitHub repository, add its URL as the `origin` remote, and push this branch.
