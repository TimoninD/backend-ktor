package ru.randik.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import ru.randik.features.signUp.SignUpReceive
import ru.randik.features.signUp.SignUpResponse
import java.util.*

fun Application.configureSignUp() {
    routing {
        post("/signUp") {
            val signInReceive = call.receive(SignUpReceive::class)
            when {
                signInReceive.login.isEmpty() -> call.respond(HttpStatusCode.BadRequest, "Логин не может быть пустым")
                else -> call.respond(SignUpResponse(UUID.randomUUID().toString()))
            }
        }
    }
}
