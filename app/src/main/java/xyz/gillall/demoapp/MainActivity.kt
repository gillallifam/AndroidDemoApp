package xyz.gillall.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
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