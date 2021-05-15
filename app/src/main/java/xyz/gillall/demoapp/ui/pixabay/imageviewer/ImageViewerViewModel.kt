package xyz.gillall.demoapp.ui.pixabay.imageviewer

import android.app.Application
import androidx.lifecycle.*
import xyz.gillall.demoapp.model.pixabay.ImageHit
import xyz.gillall.demoapp.ui.pixabay.imagegallery.ImageGalleryRepository

class ImageViewerViewModel(application: Application, private val repository: ImageGalleryRepository) :
    AndroidViewModel(application) {
    private val context = application
    private val _hit = MutableLiveData<ImageHit>()
    val hit: LiveData<ImageHit>
        get() = _hit

}