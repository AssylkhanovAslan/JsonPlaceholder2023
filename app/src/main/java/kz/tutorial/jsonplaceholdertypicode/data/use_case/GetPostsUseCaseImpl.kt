package kz.tutorial.jsonplaceholdertypicode.data.use_case

import kz.tutorial.jsonplaceholdertypicode.domain.use_case.GetPostsUseCase
import kz.tutorial.jsonplaceholdertypicode.domain.entity.Post
import kz.tutorial.jsonplaceholdertypicode.domain.repository.PostsRepository

class GetPostsUseCaseImpl(private val postsRepository: PostsRepository) : GetPostsUseCase {
    override suspend fun invoke(): List<Post> {
        return postsRepository.getPosts()
    }
}