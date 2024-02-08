package kz.tutorial.jsonplaceholdertypicode.di

import kz.tutorial.jsonplaceholdertypicode.data.GetPostsUseCaseImpl
import kz.tutorial.jsonplaceholdertypicode.domain.GetPostsUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory<GetPostsUseCase> { GetPostsUseCaseImpl(get()) }
}