package xyz.gillall.demoapp.ui.pixabay.videogallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import org.koin.androidx.viewmodel.ext.android.getViewModel
import xyz.gillall.demoapp.R
import xyz.gillall.demoapp.databinding.FragmentVideoGalleryBinding

class VideoGalleryFragment : Fragment() {

    private lateinit var binding: FragmentVideoGalleryBinding
    private lateinit var navController: NavController
    private lateinit var viewModel: VideoGalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = getViewModel()
        binding = DataBindingUtil
            .inflate(inflater, R.layout.fragment_video_gallery, container, false)
        binding.root.context
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        viewModel.updateByViewModel.observe(viewLifecycleOwner, {
            when (it.action) {
                "update" -> binding.viewModel = viewModel
            }
        })
        navController = NavHostFragment.findNavController(this)

        return binding.root
    }
}