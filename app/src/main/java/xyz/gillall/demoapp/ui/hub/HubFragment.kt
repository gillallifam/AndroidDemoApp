package xyz.gillall.demoapp.ui.hub

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import xyz.gillall.demoapp.MainActivity.Companion.clg
import xyz.gillall.demoapp.R
import xyz.gillall.demoapp.data.local.AppDatabase
import xyz.gillall.demoapp.databinding.FragmentHubBinding

class HubFragment : Fragment() {

    private lateinit var binding: FragmentHubBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_hub, container, false)
        binding.lifecycleOwner = this

        navController = findNavController(this)

        setupClicks()

        tmpCode(context)
        return binding.root
    }

    private fun tmpCode(context: Context?) {

        val database = AppDatabase.getDatabase(requireContext())
        clg(database)

        runBlocking {
            val job1 = launch {
                println("Job1 launched")
                delay(2000)
                println("Job1 timed passed")
            }
            //job1.cancel(CancellationException("user canceled"))
            job1.invokeOnCompletion { println("Job1 completed") }
        }


    }

    private fun setupClicks() {

        binding.imgsPixabay.setOnClickListener {
            navController.navigate(R.id.action_hubFragment_to_pixabayFragment)
        }

        binding.pixabayVideos.setOnClickListener {
            navController.navigate(R.id.action_hubFragment_to_videoGalleryFragment)
        }

        binding.btnSDSoft.setOnClickListener {
            navController.navigate(R.id.action_hubFragment_to_mainFragment)
        }

        binding.btnTst.setOnClickListener {
            navController.navigate(R.id.action_hubFragment_to_videoViewer)
        }
    }
}