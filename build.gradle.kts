plugins {
    java
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "come.selfstudy"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation ("come.selfstudy:listener:0.0.1-SNAPSHOT")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
//    mavenCentral()
//    maven {
//        url = uri("https://maven.pkg.github.com/parastooProgrammer/customSpringBootStarter")
//        credentials {
////            username = project.findProperty("gpr.user") as String? ?: System.getenv("gprUser")
////            password = project.findProperty("gpr.key") as String? ?: System.getenv("gprKey")
//            username = "parastooProgrammer"
//            password = "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"
//
//        }
//    }

