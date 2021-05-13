package xyz.gillall.demoapp.data.remote

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import xyz.gillall.demoapp.model.CheckIn
import xyz.gillall.demoapp.model.SDEvent


interface SDApi {
    @GET("events")
    suspend fun getEvents(): List<SDEvent>

    @GET("events/{id}")
    suspend fun getEvent(@Path("id") id: String?): SDEvent

    @POST("checkin")
    suspend fun checkIn(@Body checkin: CheckIn)
}