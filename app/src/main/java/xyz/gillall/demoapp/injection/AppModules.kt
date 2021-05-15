package xyz.gillall.demoapp.injection


import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import xyz.gillall.demoapp.shared.SharedViewModel
import xyz.gillall.demoapp.data.remote.PixabayApi
import xyz.gillall.demoapp.data.remote.SDApi
import xyz.gillall.demoapp.ui.sd.viewer.EventViewerViewModel
import xyz.gillall.demoapp.ui.pixabay.imagegallery.ImageGalleryRepository
import xyz.gillall.demoapp.ui.pixabay.imagegallery.ImageGalleryViewModel
import xyz.gillall.demoapp.ui.pixabay.videogallery.VideoGalleryRepository
import xyz.gillall.demoapp.ui.pixabay.videogallery.VideoGalleryViewModel
import xyz.gillall.demoapp.ui.pixabay.imageviewer.ImageViewerViewModel
import xyz.gillall.demoapp.ui.pixabay.videoviewer.VideoViewerViewModel
import xyz.gillall.demoapp.ui.sd.events.SDEventsRepository
import xyz.gillall.demoapp.ui.sd.events.SDEventsViewModel

object AppModules {

    val SDTest1 = module {
        single(named("SDApi")) { provideSDApi() }
        single { SDEventsRepository(get(named("SDApi"))) }
        single(named("PixabayApi")) { providePixabayApi() }
        single { ImageGalleryRepository(get(named("PixabayApi"))) }
        single { VideoGalleryRepository(get(named("PixabayApi"))) }
        viewModel { SharedViewModel() }
        viewModel { SDEventsViewModel(get()) }
        viewModel { EventViewerViewModel(get(), get()) }
        viewModel { ImageGalleryViewModel(get()) }
        viewModel { VideoGalleryViewModel(get()) }
        viewModel { ImageViewerViewModel(get(), get()) }
        viewModel { VideoViewerViewModel(get(), get()) }
    }

    private fun provideSDApi(): SDApi {
        return Retrofit.Builder()
            .baseUrl("http://5f5a8f24d44d640016169133.mockapi.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SDApi::class.java)
    }

    private fun providePixabayApi(): PixabayApi {
        return Retrofit.Builder()
            .baseUrl("https://pixabay.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PixabayApi::class.java)
    }
}