plugins {
    id("encore.kotlin-conventions")
    `java-test-fixtures`
}

dependencies {

    api("se.svt.oss:media-analyzer:2.0.7")
    implementation(kotlin("reflect"))

    compileOnly("org.springdoc:springdoc-openapi-starter-webmvc-api:2.6.0")
    compileOnly("org.springframework.data:spring-data-rest-core")
    compileOnly("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-slf4j")

    testImplementation(project(":encore-web"))
    testImplementation("org.springframework.security:spring-security-test")
    testImplementation("org.awaitility:awaitility")
    testImplementation("org.wiremock:wiremock-standalone:3.12.1")
    testImplementation("org.springframework.boot:spring-boot-starter-data-rest")
    testFixturesImplementation(platform("org.springframework.boot:spring-boot-dependencies:3.4.3"))
    testFixturesImplementation("com.redis:testcontainers-redis:2.2.4")
    testFixturesImplementation("io.github.microutils:kotlin-logging:3.0.5")
    testFixturesImplementation("org.junit.jupiter:junit-jupiter-api")
    testFixturesRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

