package kz.tutorial.jsonplaceholdertypicode.domain.use_case

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Post

interface GetPostsUseCase {
    suspend fun invoke(): List<Post>
}