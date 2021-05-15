package xyz.gillall.demoapp.ui.pixabay.videogallery

import xyz.gillall.demoapp.BuildConfig
import xyz.gillall.demoapp.data.remote.PixabayApi
import xyz.gillall.demoapp.model.pixabay.ImageHits
import xyz.gillall.demoapp.model.pixabay.VideoHits

class VideoGalleryRepository(private val pixabayApi: PixabayApi) {

    suspend fun getVideos(query: String, type: String, perpage: String): VideoHits {
        return pixabayApi.getVideos(BuildConfig.pixabayApiKey, query, type, perpage)
    }
}