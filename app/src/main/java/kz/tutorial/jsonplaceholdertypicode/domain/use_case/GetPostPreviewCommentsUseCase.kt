package kz.tutorial.jsonplaceholdertypicode.domain.use_case

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Comment

interface GetPostPreviewCommentsUseCase {
    suspend fun invoke(postId: Int): List<Comment>
}