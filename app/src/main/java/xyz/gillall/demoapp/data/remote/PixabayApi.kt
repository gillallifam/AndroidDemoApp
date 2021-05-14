package xyz.gillall.demoapp.data.remote

import retrofit2.http.*
import xyz.gillall.demoapp.model.pixabay.ImageHits
import xyz.gillall.demoapp.model.pixabay.VideoHits

interface PixabayApi {

    @GET("api")
    suspend fun getImages(@Query("key") key: String,
                          @Query("q") query: String,
                          @Query("image_type") image_type: String,
                          @Query("per_page") perpage: String): ImageHits

    @GET("api/videos")
    suspend fun getVideos(@Query("key") key: String,
                        @Query("q") query: String,
                        @Query("video_type") video_type: String,
                        @Query("per_page") perpage: String): VideoHits
}