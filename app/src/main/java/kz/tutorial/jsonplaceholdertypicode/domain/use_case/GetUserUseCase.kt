package kz.tutorial.jsonplaceholdertypicode.domain.use_case

import kz.tutorial.jsonplaceholdertypicode.domain.entity.User

interface GetUserUseCase {
    suspend fun invoke(userId: Int): User
}