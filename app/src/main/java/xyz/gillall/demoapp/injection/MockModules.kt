package xyz.gillall.demoapp.injection

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import xyz.gillall.demoapp.data.remote.SDApi
import xyz.gillall.demoapp.ui.sd.viewer.EventViewerViewModel
import xyz.gillall.demoapp.ui.sd.events.SDEventsRepository
import xyz.gillall.demoapp.ui.sd.events.SDEventsViewModel

object MockModules {

    val mockModule = module {
        single(named("SDApi")) { sdService() }
        single { SDEventsRepository(get(named("SDApi"))) }
        viewModel { SDEventsViewModel(get()) }
        viewModel { EventViewerViewModel(get(),get()) }
    }

    private fun sdService(): SDApi {
        return Retrofit.Builder()
            .baseUrl("http://5f5a8f24d44d640016169133.mockapi.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SDApi::class.java)
    }
}