plugins {
    kotlin("jvm") version "2.1.10"
}

group = "at.leisner.lumen"
version = "1.0-SNAPSHOT"


tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(22)
}