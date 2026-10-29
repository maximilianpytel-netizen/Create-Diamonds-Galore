# Create: Diamonds Galore

A NeoForge addon starter project for Minecraft 1.21.1, Create 6, and Create Aeronautics.

## What this mod adds

Create: Diamonds Galore expands diamond-related progression and introduces a powerful, naturally levitating material for vehicle building and equipment.

### Thinganium

Thinganium ore is planned to generate in the End. The material can be smelted into a purified ingot and crafted into a block; the ingot itself is not a block. Thinganium blocks provide **75 kpg of Aeronautics levitation force**. Because of its strong levitation, Thinganium is not intended for kinetic components.

Planned Thinganium equipment includes a full armor set and a sword, axe, pickaxe, shovel, and hoe. Each armor piece grants Speed II and Saturation I while worn, with the Saturation effect stacking for each additional piece.

### Elytra upgrades

An upgrade template is planned to use seven phantom membranes, one end stone, and either a Thingium ingot or diamond alloy. Elytra upgrade materials are planned to include Netherite, diamond alloy, and Thingium. A Thingium upgrade makes the elytra lighter and more durable, trades slower acceleration for improved steering, and allows it to maintain speed while climbing up to a configurable height.

### Diamond alloy

Diamond alloy combines diamonds with Thinganium. It is planned as a tool-upgrade material that improves durability and reduces weight, allowing faster swings.

> **Naming note:** The design notes use both “Thinganium” and “Thingium” for the material. The intended distinction (or final name) still needs to be settled.

## Requirements

- Java 21
- An internet connection for Gradle to download Minecraft, NeoForge, and mod dependencies

## Development

- `./gradlew runClient` launches a development client with Create, Create Aeronautics, and Sable.
- `./gradlew runServer` launches a development server with those mods.
- `./gradlew build` builds the addon JAR in `build/libs/`.
- `./gradlew runData` generates data resources.

The starter mod entry point is `src/main/java/com/maxdiamondsgalore/DiamondsGalore.java`. Mod metadata and required dependency versions are in `src/main/resources/META-INF/neoforge.mods.toml`.

Example recipes are in `src/main/resources/data/diamonds_galore/recipe/`, organized by recipe type. Asset folders for item and block models and textures are under `src/main/resources/assets/diamonds_galore/`.
