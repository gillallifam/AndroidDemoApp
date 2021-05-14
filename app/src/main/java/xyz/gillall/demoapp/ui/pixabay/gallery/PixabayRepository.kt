package xyz.gillall.demoapp.ui.pixabay.gallery

import xyz.gillall.demoapp.BuildConfig
import xyz.gillall.demoapp.data.remote.PixabayApi
import xyz.gillall.demoapp.model.Hits

class PixabayRepository(private val pixabayApi: PixabayApi) {

    suspend fun getData(query: String, type: String, perpage: String): Hits {
        return pixabayApi.getData(BuildConfig.pixabayApiKey, query, type, perpage)
    }
}