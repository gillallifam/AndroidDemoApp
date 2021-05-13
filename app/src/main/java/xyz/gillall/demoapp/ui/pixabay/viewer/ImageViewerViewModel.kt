package xyz.gillall.demoapp.ui.pixabay.viewer

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.*
import xyz.gillall.demoapp.model.CheckIn
import xyz.gillall.demoapp.model.SDEvent
import xyz.gillall.demoapp.ui.sdevents.SDEventsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import xyz.gillall.demoapp.model.Hit
import xyz.gillall.demoapp.ui.pixabay.gallery.PixabayRepository

class ImageViewerViewModel(application: Application, private val repository: PixabayRepository) :
    AndroidViewModel(application) {
    private val context = application
    private val _hit = MutableLiveData<Hit>()
    val hit: LiveData<Hit>
        get() = _hit

}