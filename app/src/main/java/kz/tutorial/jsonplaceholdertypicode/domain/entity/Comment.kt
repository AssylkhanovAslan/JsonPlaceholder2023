package kz.tutorial.jsonplaceholdertypicode.domain.entity

data class Comment(
    val body: String,
    val email: String,
    val id: Int,
    val name: String,
    val postId: Int
)