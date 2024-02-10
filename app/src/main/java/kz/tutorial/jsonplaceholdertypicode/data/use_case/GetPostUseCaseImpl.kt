package kz.tutorial.jsonplaceholdertypicode.data.use_case

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Post
import kz.tutorial.jsonplaceholdertypicode.domain.repository.PostsRepository
import kz.tutorial.jsonplaceholdertypicode.domain.use_case.GetPostUseCase

class GetPostUseCaseImpl(private val repository: PostsRepository) : GetPostUseCase {
    override suspend fun invoke(postId: Int): Post {
        return repository.getPost(postId)
    }
}