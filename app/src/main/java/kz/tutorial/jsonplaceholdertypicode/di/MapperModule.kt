package kz.tutorial.jsonplaceholdertypicode.di

import kz.tutorial.jsonplaceholdertypicode.data.mapper.AlbumMapper
import kz.tutorial.jsonplaceholdertypicode.data.mapper.AlbumMapperImpl
import org.koin.dsl.module

val mapperModule = module {
    factory<AlbumMapper> { AlbumMapperImpl() }
}