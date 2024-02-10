package kz.tutorial.jsonplaceholdertypicode.domain.entity

data class Address(
    val city: String,
    val geo: Geo,
    val street: String,
    val suite: String,
    val zipcode: String
)