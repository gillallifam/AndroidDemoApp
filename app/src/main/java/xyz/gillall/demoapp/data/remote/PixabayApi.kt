package xyz.gillall.demoapp.data.remote

import retrofit2.http.*
import xyz.gillall.demoapp.model.CheckIn
import xyz.gillall.demoapp.model.Hits
import xyz.gillall.demoapp.model.SDEvent


interface PixabayApi {

    @GET("api")
    suspend fun getPhotos(@Query("key") key: String,
                          @Query("q") q: String,
                          @Query("image_type") image_type: String,
                          @Query("per_page") perpage: String): Hits
}