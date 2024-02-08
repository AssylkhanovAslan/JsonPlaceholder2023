package kz.tutorial.jsonplaceholdertypicode.domain

interface GetPostsUseCase {
    suspend fun invoke(): List<Post>
}