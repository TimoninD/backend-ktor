package ru.randik.cache

import ru.randik.features.signUp.SignUpReceive

data class TokenCache(
    val login: String,
    val token: String
)

object InMemoryCache {
    val userList: MutableList<SignUpReceive> = mutableListOf()
    val token: MutableList<TokenCache> = mutableListOf()
}