package xyz.gillall.demoapp.injection

import android.app.Application
import xyz.gillall.demoapp.injection.AppModules.SDTest1
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger(Level.INFO)
            androidContext(this@BaseApplication)
            modules(SDTest1)
        }
    }
}