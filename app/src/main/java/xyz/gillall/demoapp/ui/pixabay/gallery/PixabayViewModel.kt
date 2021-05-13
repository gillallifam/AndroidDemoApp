package xyz.gillall.demoapp.ui.pixabay.gallery

import androidx.lifecycle.*
import kotlinx.coroutines.launch
import xyz.gillall.demoapp.MainActivity.Companion.clg
import xyz.gillall.demoapp.model.Hits

class PixabayViewModel(private val repository: PixabayRepository) : ViewModel() {

    private val _hits = MutableLiveData<Hits>()
    val hits: LiveData<Hits>
        get() = _hits


    fun getPhotos(q: String, perpage: String) {
        viewModelScope.launch {
            var hits = repository.getPhotos(q, perpage)
            _hits.value = hits
            clg(hits)
        }
    }

}