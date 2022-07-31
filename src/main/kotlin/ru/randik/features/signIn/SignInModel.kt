package ru.randik.features.signIn

import kotlinx.serialization.Serializable

@Serializable
data class SignInReceive(
    val login: String,
    val password: String
)

@Serializable
data class SignInResponse(
    val token: String
)