plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "me.rostislav.tolushkin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}