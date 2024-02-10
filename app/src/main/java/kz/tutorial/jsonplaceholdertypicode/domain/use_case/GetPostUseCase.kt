package kz.tutorial.jsonplaceholdertypicode.domain.use_case

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Post

interface GetPostUseCase {
    suspend fun invoke(postId: Int): Post
}