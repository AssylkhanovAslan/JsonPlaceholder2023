package kz.tutorial.jsonplaceholdertypicode.data.mapper

import kz.tutorial.jsonplaceholdertypicode.data.entity.AlbumRemote
import kz.tutorial.jsonplaceholdertypicode.data.entity.PhotoRemote
import kz.tutorial.jsonplaceholdertypicode.domain.entity.Album
import kz.tutorial.jsonplaceholdertypicode.domain.entity.User

class AlbumMapperImpl : AlbumMapper {
    override fun toDomain(albumRemote: AlbumRemote, user: User, previewPhoto: PhotoRemote): Album {
        return Album(
            userId = user.id,
            id = albumRemote.id,
            title = albumRemote.title,
            username = user.username,
            photoUrl = previewPhoto.thumbnailUrl,
        )
    }

    override fun toDomain(
        albums: List<AlbumRemote>,
        users: List<User>,
        photos: List<PhotoRemote>
    ): List<Album> {
        return albums.map { albumRemote ->
            val correspondingUser = users.find { it.id == albumRemote.userId }?: return emptyList()
            val correspondingPhoto = photos.first { it.albumId == albumRemote.id }

            toDomain(albumRemote, user = correspondingUser, previewPhoto = correspondingPhoto)
        }
    }
}