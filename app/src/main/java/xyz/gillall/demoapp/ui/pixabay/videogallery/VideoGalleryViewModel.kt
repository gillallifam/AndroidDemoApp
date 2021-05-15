package xyz.gillall.demoapp.ui.pixabay.videogallery

import androidx.lifecycle.*
import kotlinx.coroutines.launch
import xyz.gillall.demoapp.model.Command
import xyz.gillall.demoapp.model.pixabay.VideoHits
import java.util.*
import kotlin.concurrent.schedule

class VideoGalleryViewModel(private val repository: VideoGalleryRepository) : ViewModel() {

    private var loaded = false
    var tst = "TST"
    var updateByViewModel = MutableLiveData<Command>()

    init {
        Timer().schedule(1000) {
            tst = "Changed"
            updateByViewModel.postValue(Command("update","{}"))
        }
    }

    private val _videohits = MutableLiveData<VideoHits>()
    val videohits: LiveData<VideoHits>
        get() = _videohits

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