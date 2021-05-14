package xyz.gillall.demoapp.ui.pixabay.imagegallery

import androidx.lifecycle.*
import kotlinx.coroutines.launch
import xyz.gillall.demoapp.model.pixabay.ImageHits
import xyz.gillall.demoapp.model.pixabay.VideoHits

class PixabayViewModel(private val repository: PixabayRepository) : ViewModel() {

    private var loaded = false

    private val _imagehits = MutableLiveData<ImageHits>()
    val imagehits: LiveData<ImageHits>
        get() = _imagehits

    private val _videohits = MutableLiveData<VideoHits>()
    val videohits: LiveData<VideoHits>
        get() = _videohits

    fun getImages(query: String, type: String, perpage: String) {
        if (!loaded) {
            viewModelScope.launch {
                val hits = repository.getImages(query, type, perpage)
                _imagehits.value = hits
                loaded = true
            }
        }
    }

    fun getVideos(query: String, type: String, perpage: String) {
        if (!loaded) {
            viewModelScope.launch {
                val hits = repository.getVideos(query, type, perpage)
                _videohits.value = hits
                loaded = true
            }
        }
    }
}