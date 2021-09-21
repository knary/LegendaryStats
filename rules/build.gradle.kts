plugins {
    kotlin("multiplatform") version "1.5.31"
    id("org.sonarqube") version "3.3"
}

group = "games.lmdbg.rules"
version = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js(LEGACY) {
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }

    
    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
    }
}
sonarqube {
    properties {
        property("sonar.projectKey", "knary_LegendaryStats")
        property( "sonar.organization", "kon")
        property( "sonar.host.url", "https://sonarcloud.io")
    }
}
