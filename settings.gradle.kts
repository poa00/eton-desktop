pluginManagement {
    repositories {
        gradlePluginPortal()
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
        maven("https://maven.hq.hydraulic.software")
    }
}

rootProject.name = "eton"
include("data")
