package kz.tutorial.jsonplaceholdertypicode

import android.app.Application
import kz.tutorial.jsonplaceholdertypicode.di.mapperModule
import kz.tutorial.jsonplaceholdertypicode.di.networkModule
import kz.tutorial.jsonplaceholdertypicode.di.repositoryModule
import kz.tutorial.jsonplaceholdertypicode.di.useCaseModule
import kz.tutorial.jsonplaceholdertypicode.di.viewModelModule
import org.koin.core.context.startKoin
import timber.log.Timber

class TutorialApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initTimber()
        initDI()
    }

    private fun initTimber() {
        Timber.plant(Timber.DebugTree())
    }

    private fun initDI() {
        startKoin {
            modules(networkModule, viewModelModule, repositoryModule, useCaseModule, mapperModule)
        }
    }
}