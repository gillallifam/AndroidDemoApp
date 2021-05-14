package xyz.gillall.demoapp.ui.pixabay.gallery

import androidx.lifecycle.*
import kotlinx.coroutines.launch
import xyz.gillall.demoapp.model.Hits

class PixabayViewModel(private val repository: PixabayRepository) : ViewModel() {

    private var loaded = false
    private val _hits = MutableLiveData<Hits>()
    val hits: LiveData<Hits>
        get() = _hits

    fun getData(query: String, type: String, perpage: String) {
        if (!loaded) {
            viewModelScope.launch {
                val hits = repository.getData(query, type, perpage)
                _hits.value = hits
                loaded = true
            }
        }
    }
}