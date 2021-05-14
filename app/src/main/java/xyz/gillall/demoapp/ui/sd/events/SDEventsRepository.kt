package xyz.gillall.demoapp.ui.sd.events

import xyz.gillall.demoapp.data.remote.SDApi
import xyz.gillall.demoapp.model.sd.CheckIn
import xyz.gillall.demoapp.model.sd.SDEvent

class SDEventsRepository(private val sdService: SDApi) {

    suspend fun getEvents(): List<SDEvent> {
        return try {
            sdService.getEvents()
        } catch (e: Exception) {
            mutableListOf()//empty list
        }
    }

    suspend fun getEvent(id: String?): SDEvent? {
        return try {
            sdService.getEvent(id)
        } catch (e: Exception) {
            return null
        }
    }

    suspend fun checkIN(data: CheckIn): Boolean {
        return try {
            sdService.checkIn(data)
            return true
        } catch (e: Exception) {
            false
        }
    }
}