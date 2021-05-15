package xyz.gillall.demoapp.ui.pixabay.videoviewer

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import xyz.gillall.demoapp.model.pixabay.VideoHit
import xyz.gillall.demoapp.ui.pixabay.videogallery.VideoGalleryRepository

class VideoViewerViewModel(application: Application, private val repository: VideoGalleryRepository) :
    AndroidViewModel(application) {
    private val context = application
    private val _hit = MutableLiveData<VideoHit>()
    val hit: LiveData<VideoHit>
        get() = _hit

}