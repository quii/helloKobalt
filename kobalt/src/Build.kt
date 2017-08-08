import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*

val kotlinVersion = "1.1.2"
val http4kVersion = "2.17.1"

val web = project {
    name = "hellokobalt"
    group = "com.quii"
    artifactId = name
    version = "0.1"

    dependencies {
        compile("org.jetbrains.kotlin:kotlin-runtime:$kotlinVersion")
        compile("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
        compile("org.http4k:http4k-core:$http4kVersion")
        compile("org.http4k:http4k-server-jetty:$http4kVersion")
        compile("org.http4k:http4k-client-apache:$http4kVersion")
        compile("org.http4k:http4k-testing-hamkrest:$http4kVersion")
        compile("com.natpryce:hamkrest:1.4.1.0")
    }

    dependenciesTest {
        compile("junit:junit:4.11")
    }

    assemble {
        jar {
        }
    }

    application {
        mainClass = "com.quii.hellokobalt.app.main"
        taskName = "web"
    }
}