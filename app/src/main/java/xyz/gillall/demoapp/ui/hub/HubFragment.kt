package xyz.gillall.demoapp.ui.hub

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import xyz.gillall.demoapp.R
import xyz.gillall.demoapp.databinding.HubFragmentBinding


class HubFragment : Fragment() {

    private lateinit var binding: HubFragmentBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.hub_fragment, container, false)
        binding.lifecycleOwner = this

        navController = findNavController(this)

        setupClicks()
        return binding.root
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