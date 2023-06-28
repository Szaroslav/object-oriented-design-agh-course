plugins {
    id("application")
    id("org.openjfx.javafxplugin") version "0.0.14"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

javafx {
    version("17")
    modules("javafx.controls", "javafx.fxml")
}

tasks.test {
    useJUnitPlatform()
}
