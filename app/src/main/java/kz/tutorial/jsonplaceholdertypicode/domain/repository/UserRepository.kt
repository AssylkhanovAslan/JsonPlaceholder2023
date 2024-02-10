package kz.tutorial.jsonplaceholdertypicode.domain.repository

import kz.tutorial.jsonplaceholdertypicode.domain.entity.User

interface UserRepository {
    suspend fun getUser(userId: Int): User
}