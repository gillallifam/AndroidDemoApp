package xyz.gillall.demoapp.model.pixabay

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class VideoHit: Parcelable {

    var id: Int? = null
    var pageURL: String? = null
    var type: String? = null
    var tags: String? = null
    var duration: Int? = null
    var pictureId: String? = null
    var videos: Videos? = null
    var views: Int? = null
    var downloads: Int? = null
    var favorites: Int? = null
    var likes: Int? = null
    var comments: Int? = null
    var userId: Int? = null
    var user: String? = null
    var userImageURL: String? = null
}