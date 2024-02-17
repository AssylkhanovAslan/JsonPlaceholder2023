package kz.tutorial.jsonplaceholdertypicode.data.repository

import kz.tutorial.jsonplaceholdertypicode.data.mapper.AlbumMapper
import kz.tutorial.jsonplaceholdertypicode.data.network.MainApi
import kz.tutorial.jsonplaceholdertypicode.domain.entity.Album
import kz.tutorial.jsonplaceholdertypicode.domain.repository.PhotoRepository
import kz.tutorial.jsonplaceholdertypicode.domain.repository.UserRepository

class PhotoRepositoryImpl(
    private val mainApi: MainApi,
    private val userRepository: UserRepository,
    private val albumMapper: AlbumMapper,
) : PhotoRepository {
    override suspend fun getAlbums(): List<Album> {
        val remoteAlbums = mainApi.getAlbums()
        val users = userRepository.getUsers()
        val photos = mainApi.getAllPhotos()

        return albumMapper.toDomain(remoteAlbums, users, photos)
    }
}