plugins {
    id("net.neoforged.moddev") version "2.0.140"
}

group = "com.maxdiamondsgalore"
version = "1.0.0"

base {
    archivesName.set("create-diamonds-galore")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

repositories {
    mavenCentral()
    maven("https://maven.neoforged.net/releases")
    maven("https://maven.createmod.net")
    maven("https://maven.ryanhcode.dev/releases")
    exclusiveContent {
        forRepository {
            maven("https://api.modrinth.com/maven")
        }
        filter {
            includeGroup("maven.modrinth")
        }
    }
}

neoForge {
    version = "21.1.247"

    runs {
        configureEach {
            systemProperty("neoforge.enabledGameTestNamespaces", "diamonds_galore")
        }

        create("client") {
            client()
        }

        create("server") {
            server()
            programArgument("--nogui")
        }

        create("data") {
            data()
            programArguments.addAll(
                "--mod", "diamonds_galore",
                "--all",
                "--output", file("src/generated/resources").absolutePath,
                "--existing", file("src/main/resources").absolutePath
            )
        }
    }

    mods {
        create("diamonds_galore") {
            sourceSet(sourceSets.main.get())
        }
    }
}

dependencies {
    compileOnly("com.simibubi.create:create-1.21.1:6.0.10-280")
    compileOnly("dev.eriksonn.aeronautics:aeronautics-neoforge-1.21.1:1.3.2") {
        isTransitive = false
    }

    runtimeOnly("maven.modrinth:create:6.0.10+mc1.21.1")
    runtimeOnly("maven.modrinth:create-aeronautics:1.3.2+mc1.21.1")
    runtimeOnly("maven.modrinth:sable:2.0.6+mc1.21.1")
}

sourceSets.main {
    resources.srcDir("src/generated/resources")
}

tasks.processResources {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    val modProperties = mapOf(
        "mod_id" to "diamonds_galore",
        "mod_name" to "Create: Diamonds Galore",
        "mod_version" to project.version,
        "mod_license" to "All Rights Reserved",
        "mod_authors" to "Your Name",
        "mod_description" to "A Create and Create Aeronautics addon."
    )
    inputs.properties(modProperties)
    filesMatching("META-INF/neoforge.mods.toml") {
        expand(modProperties)
    }
}
