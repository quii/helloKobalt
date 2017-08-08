import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*

val p = project {
    name = "hellokobalt"
    group = "com.quii"
    artifactId = name
    version = "0.1"

    dependencies {
        compile("org.jetbrains.kotlin:kotlin-runtime:1.1.2")
        compile("org.jetbrains.kotlin:kotlin-stdlib:1.1.2")
        compile("org.http4k:http4k-core:2.11.2")
        compile("org.http4k:http4k-server-jetty:2.11.2")
        compile("org.http4k:http4k-client-apache:2.11.2")
        compile("org.http4k:http4k-testing-hamkrest:2.17.1")
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