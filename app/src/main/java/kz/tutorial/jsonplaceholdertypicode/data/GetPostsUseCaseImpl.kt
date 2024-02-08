package kz.tutorial.jsonplaceholdertypicode.data

import kz.tutorial.jsonplaceholdertypicode.domain.GetPostsUseCase
import kz.tutorial.jsonplaceholdertypicode.domain.Post
import kz.tutorial.jsonplaceholdertypicode.domain.PostsRepository

class GetPostsUseCaseImpl(private val postsRepository: PostsRepository) : GetPostsUseCase {
    override suspend fun invoke(): List<Post> {
        return postsRepository.getPosts()
    }
}