package xyz.gillall.demolib1

import retrofit2.http.*

interface PixabayApi {

    @GET("api")
    suspend fun getPhotos(@Query("key") key: String,
                          @Query("q") query: String,
                          @Query("image_type") image_type: String,
                          @Query("per_page") perpage: String): Hits
}