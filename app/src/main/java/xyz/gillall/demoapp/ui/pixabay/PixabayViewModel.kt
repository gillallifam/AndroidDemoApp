package xyz.gillall.demoapp.ui.pixabay

import androidx.lifecycle.*
import xyz.gillall.demoapp.model.SDEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import xyz.gillall.demoapp.ui.sdevents.SDEventsRepository

class PixabayViewModel(private val repository: PixabayRepository) : ViewModel() {

    private val _events = MutableLiveData<List<SDEvent>>()
    val events: LiveData<List<SDEvent>>
        get() = _events


}