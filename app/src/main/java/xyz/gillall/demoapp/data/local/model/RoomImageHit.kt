package xyz.gillall.demoapp.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RoomImageHit(
    @PrimaryKey
    var id: Int?,
    var pageURL: String?,
    var type: String?,
    var tags: String?,
    var previewURL: String?,
    var previewWidth: Int?,
    var previewHeight: Int?,
    var webformatURL: String?,
    var webformatWidth: Int?,
    var webformatHeight: Int?,
    var largeImageURL: String?,
    var imageWidth: Int?,
    var imageHeight: Int?,
    var imageSize: Int?,
    var views: Int?,
    var downloads: Int?,
    var favorites: Int?,
    var likes: Int?,
    var comments: Int?,
    var userId: Int?,
    var user: String?,
    var userImageURL: String?
)