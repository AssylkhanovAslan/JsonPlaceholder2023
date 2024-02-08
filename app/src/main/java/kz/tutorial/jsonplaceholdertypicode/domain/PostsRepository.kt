package kz.tutorial.jsonplaceholdertypicode.domain

import kz.tutorial.jsonplaceholdertypicode.domain.Post

interface PostsRepository {
    suspend fun getPosts(): List<Post>
}