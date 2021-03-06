plugins {
  kotlin("jvm").version("1.3.72").apply(false)
  id("com.apollographql.apollo").version("2.2.4-SNAPSHOT").apply(false)
}

allprojects {
  repositories {
    mavenCentral()
    mavenLocal()
  }

  tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
      jvmTarget = "1.8"
    }
  }
}

