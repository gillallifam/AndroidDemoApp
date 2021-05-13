package xyz.gillall.demoapp.ui.sdevents

import androidx.lifecycle.*
import xyz.gillall.demoapp.model.SDEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import xyz.gillall.demoapp.ui.sdevents.SDEventsRepository

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