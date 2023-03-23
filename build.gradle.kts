plugins {
    kotlin("multiplatform") version "1.8.10"
}

group = "com.russhwolf"
version = "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
}

kotlin {
    iosArm64()
    iosSimulatorArm64()
    iosX64()
    linuxX64()
    macosX64()
    macosArm64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("androidx.datastore:datastore-preferences-core:1.1.0-alpha02")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
