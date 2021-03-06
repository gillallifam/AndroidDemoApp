package xyz.gillall.demoapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.getViewModel
import xyz.gillall.demoapp.shared.SharedViewModel

/**
 * INTRO
 * ui packages grouped for fast find related files
 * LIBRARIES:
 * retrofit > the almost default way of work with network calls, recommended by google
 * koin > In execution time dependency injection
 * glide > Easy image loader and cache
 * JETPACK
 * Databinding > no findviewbyid, easy access to views
 * Recyclerview > Support huge amount of items(Events) with low memory usage
 * OTHERS
 * BindingAdapters > Create functions for use while binding views
 * FUTURE TASKS
 * Fix icons on bottom
 * Use a Workmanager to fetch data periodically and update
 * Stop using the endpoint for get a single event, the data is already here.
 * Use Room to store data offline
 * Make app full screen
 * Extract strings, translations
 * Handle rotate if needed
 * Add loaders while fetch data
 * Setup navigation transitions
 * Unit tests
 */

class MainActivity : AppCompatActivity() {

    val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")
    private lateinit var sharedViewModel: SharedViewModel
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedViewModel = getViewModel()
        sharedViewModel.sharedCall("Called from main")
        clg("shared",sharedViewModel)
        context = this

        val EXAMPLE_COUNTER = intPreferencesKey("example_counter")
        val exampleCounterFlow: Flow<Int> = this.dataStore.data
            .map { preferences ->
                // No type safety.
                preferences[EXAMPLE_COUNTER] ?: 0
            }


        clg(exampleCounterFlow)


        GlobalScope.launch {
                context.dataStore.edit { settings ->
                    val currentCounterValue = settings[EXAMPLE_COUNTER] ?: 0
                    settings[EXAMPLE_COUNTER] = currentCounterValue + 1
                }

        }

    }

    companion object {
        //log multiple variables, used in debug
        fun clg(vararg values: Any?) {
            if (values.isEmpty()) return
            var v = 1
            for (c in values) {
                if (v < values.size) {
                    v++
                    print(c.toString() + " ")
                } else {
                    println(c)
                }
            }
        }
    }
}