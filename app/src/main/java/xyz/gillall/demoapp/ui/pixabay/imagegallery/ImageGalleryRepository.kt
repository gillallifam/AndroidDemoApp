package xyz.gillall.demoapp.ui.pixabay.imagegallery

import xyz.gillall.demoapp.BuildConfig
import xyz.gillall.demoapp.MainActivity.Companion.clg
import xyz.gillall.demoapp.data.local.AppDatabase
import xyz.gillall.demoapp.data.remote.PixabayApi
import xyz.gillall.demoapp.model.pixabay.ImageHits
import xyz.gillall.demoapp.model.pixabay.VideoHits

class ImageGalleryRepository(private val pixabayApi: PixabayApi, private val appDataBase: AppDatabase) {

    init{
        clg(appDataBase)
    }
    suspend fun getImages(query: String, type: String, perpage: String): ImageHits {
        return pixabayApi.getImages(BuildConfig.pixabayApiKey, query, type, perpage)
    }

    suspend fun getVideos(query: String, type: String, perpage: String): VideoHits {
        return pixabayApi.getVideos(BuildConfig.pixabayApiKey, query, type, perpage)
    }
}