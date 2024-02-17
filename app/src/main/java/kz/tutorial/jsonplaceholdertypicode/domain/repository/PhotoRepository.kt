package kz.tutorial.jsonplaceholdertypicode.domain.repository

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Album

interface PhotoRepository {
    suspend fun getAlbums(): List<Album>

}