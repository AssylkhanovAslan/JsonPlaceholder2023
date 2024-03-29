package kz.tutorial.jsonplaceholdertypicode.di

import android.provider.ContactsContract.Contacts.Photo
import kz.tutorial.jsonplaceholdertypicode.data.repository.PhotoRepositoryImpl
import kz.tutorial.jsonplaceholdertypicode.data.repository.PostsRepositoryImpl
import kz.tutorial.jsonplaceholdertypicode.data.repository.UserRepositoryImpl
import kz.tutorial.jsonplaceholdertypicode.domain.repository.PostsRepository
import kz.tutorial.jsonplaceholdertypicode.domain.repository.UserRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory<PostsRepository> { PostsRepositoryImpl(get()) }
    factory<UserRepository> { UserRepositoryImpl(get()) }
    factory<PhotoRepositoryImpl> {
        PhotoRepositoryImpl(
            mainApi = get(),
            userRepository = get(),
            albumMapper = get()
        )
    }
}