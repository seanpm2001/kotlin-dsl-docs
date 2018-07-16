pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
    }
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.dokka" -> useModule("org.jetbrains.dokka:dokka-gradle-plugin:0.9.16-eap-2")
                "org.ajoberstar.github-pages" -> useModule("org.ajoberstar:gradle-git:1.7.1")
            }
        }
    }
}

rootProject.name = "gradle-kotlin-dsl-docs"