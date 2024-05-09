package com.example.aruuke_rakhmanova_01_4m

import java.io.Serializable

data class User(
    val name: String,
    val email: String,
    val password: Int) : Serializable