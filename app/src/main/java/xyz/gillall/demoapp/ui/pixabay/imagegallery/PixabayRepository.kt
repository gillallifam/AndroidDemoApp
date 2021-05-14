package xyz.gillall.demoapp.ui.pixabay.imagegallery

import xyz.gillall.demoapp.BuildConfig
import xyz.gillall.demoapp.data.remote.PixabayApi
import xyz.gillall.demoapp.model.pixabay.ImageHits
import xyz.gillall.demoapp.model.pixabay.VideoHits

class PixabayRepository(private val pixabayApi: PixabayApi) {

    suspend fun getImages(query: String, type: String, perpage: String): ImageHits {
        return pixabayApi.getImages(BuildConfig.pixabayApiKey, query, type, perpage)
    }

    suspend fun getVideos(query: String, type: String, perpage: String): VideoHits {
        return pixabayApi.getVideos(BuildConfig.pixabayApiKey, query, type, perpage)
    }
}