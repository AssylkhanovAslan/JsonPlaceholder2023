package kz.tutorial.jsonplaceholdertypicode.data.use_case

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Album
import kz.tutorial.jsonplaceholdertypicode.domain.repository.PhotoRepository
import kz.tutorial.jsonplaceholdertypicode.domain.use_case.GetAlbumsUseCase

class GetAlbumsUseCaseImpl(private val photoRepository: PhotoRepository) : GetAlbumsUseCase {
    override suspend fun invoke(): List<Album> {
        return photoRepository.getAlbums()
    }
}