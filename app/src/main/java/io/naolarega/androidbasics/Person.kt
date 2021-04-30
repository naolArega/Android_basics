package io.naolarega.androidbasics

import java.io.Serializable

data class Person(var name: String, var age: Int, var country: String) : Serializable