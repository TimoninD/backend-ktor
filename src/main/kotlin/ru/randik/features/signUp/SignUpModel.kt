package ru.randik.features.signUp

import kotlinx.serialization.Serializable

@Serializable
data class SignUpReceive(
    val login: String,
    val password: String,
    val repeatPassword: String,
    val name: String
)

@Serializable
data class SignUpResponse(
    val token: String
)