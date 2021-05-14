package xyz.gillall.demoapp.data.remote

import retrofit2.http.*
import xyz.gillall.demoapp.model.Hits

interface PixabayApi {

    @GET("api")
    suspend fun getData(@Query("key") key: String,
                          @Query("q") q: String,
                          @Query("image_type") image_type: String,
                          @Query("per_page") perpage: String): Hits
}