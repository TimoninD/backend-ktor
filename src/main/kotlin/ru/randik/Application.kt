package ru.randik

import io.ktor.server.engine.*
import io.ktor.server.cio.*
import ru.randik.plugins.*

fun main() {
    embeddedServer(CIO, port = 8080, host = "0.0.0.0") {
        configureSockets()
        configureRouting()
    }.start(wait = true)
}
