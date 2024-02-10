package kz.tutorial.jsonplaceholdertypicode.domain.repository

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Comment
import kz.tutorial.jsonplaceholdertypicode.domain.entity.Post

interface PostsRepository {
    suspend fun getPosts(): List<Post>

    suspend fun getPost(postId: Int): Post

    suspend fun getPostComments(postId: Int): List<Comment>
}