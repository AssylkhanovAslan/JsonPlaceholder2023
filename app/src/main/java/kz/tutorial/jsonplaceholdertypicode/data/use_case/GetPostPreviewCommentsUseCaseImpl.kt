package kz.tutorial.jsonplaceholdertypicode.data.use_case

import kz.tutorial.jsonplaceholdertypicode.constants.PREVIEW_COMMENTS_SIZE
import kz.tutorial.jsonplaceholdertypicode.domain.entity.Comment
import kz.tutorial.jsonplaceholdertypicode.domain.repository.PostsRepository
import kz.tutorial.jsonplaceholdertypicode.domain.use_case.GetPostPreviewCommentsUseCase

class GetPostPreviewCommentsUseCaseImpl(private val repo: PostsRepository) : GetPostPreviewCommentsUseCase {
    override suspend fun invoke(postId: Int): List<Comment> {
        return repo.getPostComments(postId).take(PREVIEW_COMMENTS_SIZE)
    }
}