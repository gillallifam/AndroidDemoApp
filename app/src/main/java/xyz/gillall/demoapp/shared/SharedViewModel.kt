package xyz.gillall.demoapp.shared

import androidx.lifecycle.ViewModel
import xyz.gillall.demoapp.MainActivity.Companion.clg

class SharedViewModel(): ViewModel() {
    init {
        clg("Init shared")
    }

    fun sharedCall(str: String){
        clg(str)
    }
}