package ru.randik

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ru.randik.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080) {
        configureSockets()
        configureSignUp()
        configureSerialization()
    }.start(wait = true)
}
