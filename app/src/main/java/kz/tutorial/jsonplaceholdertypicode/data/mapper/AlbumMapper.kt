package kz.tutorial.jsonplaceholdertypicode.data.mapper

import kz.tutorial.jsonplaceholdertypicode.data.entity.AlbumRemote
import kz.tutorial.jsonplaceholdertypicode.data.entity.PhotoRemote
import kz.tutorial.jsonplaceholdertypicode.domain.entity.Album
import kz.tutorial.jsonplaceholdertypicode.domain.entity.User

interface AlbumMapper {
    fun toDomain(albumRemote: AlbumRemote, user: User, previewPhoto: PhotoRemote): Album

    fun toDomain(albums: List<AlbumRemote>, users: List<User>, photos: List<PhotoRemote>): List<Album>
}