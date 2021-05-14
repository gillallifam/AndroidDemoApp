package xyz.gillall.demoapp.ui.sd.events

import androidx.lifecycle.*
import xyz.gillall.demoapp.model.sd.SDEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SDEventsViewModel(private val repository: SDEventsRepository) : ViewModel() {
    private val _events = MutableLiveData<List<SDEvent>>()
    val events: LiveData<List<SDEvent>>
        get() = _events

    fun getEvents() {
        viewModelScope.launch(Dispatchers.IO) {
            _events.postValue(repository.getEvents())
        }
    }
}