dependencies {
    implementation(project(":domain"))
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
    if (project.hasProperty("local")) {
        dependencies {
            testImplementation("de.flapdoodle.embed:de.flapdoodle.embed.mongo")
        }
    }
}