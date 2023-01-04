tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":infrastructures:infra-oracle-jpa"))
    implementation(project(":infrastructures:infra-mongo"))
}