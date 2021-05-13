package xyz.gillall.demoapp.ui.eventviewer

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.*
import xyz.gillall.demoapp.model.CheckIn
import xyz.gillall.demoapp.model.SDEvent
import xyz.gillall.demoapp.ui.sdevents.SDEventsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EventViewerViewModel(application: Application, private val repository: SDEventsRepository) :
    AndroidViewModel(application) {
    private val context = application
    private val _event = MutableLiveData<SDEvent>()
    val event: LiveData<SDEvent>
        get() = _event

    fun checkIn(data: CheckIn) {
        viewModelScope.launch(Dispatchers.IO) {
            val checked = repository.checkIN(data)
            viewModelScope.launch {
                if (checked) {
                    Toast.makeText(context, "Checkin realizado!", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(context, "Tente novamente!", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    fun getEvent(id: String?) {
        viewModelScope.launch(Dispatchers.IO) {
            _event.postValue(repository.getEvent(id))
        }
    }
}