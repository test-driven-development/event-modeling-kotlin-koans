rootProject.name = "event-modeling-koans"
pluginManagement {
  repositories {
    gradlePluginPortal()
    mavenCentral()
  }
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
    maven {
      name = "confluent"
      url = uri("https://packages.confluent.io/maven")
    }
  }
}
