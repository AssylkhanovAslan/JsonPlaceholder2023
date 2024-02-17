package kz.tutorial.jsonplaceholdertypicode.domain.use_case

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Album

interface GetAlbumsUseCase {
    suspend fun invoke(): List<Album>
}