package xyz.gillall.demoapp.ui.pixabay.viewer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import org.koin.androidx.viewmodel.ext.android.getViewModel
import xyz.gillall.demoapp.MainActivity.Companion.clg
import xyz.gillall.demoapp.R
import xyz.gillall.demoapp.databinding.FragmentImageViewerBinding
import xyz.gillall.demoapp.model.Hit
import xyz.gillall.demoapp.util.Image.imageFromURL

class ImageViewer : Fragment() {
    private lateinit var imgData: Hit
    private lateinit var binding: FragmentImageViewerBinding
    private lateinit var navController: NavController
    private lateinit var viewModel: ImageViewerViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = getViewModel()
        arguments?.let {
            imgData = it.getParcelable("hit")!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_image_viewer, container, false)
        binding.lifecycleOwner = this
        navController = NavHostFragment.findNavController(this)

        imgData.webformatURL?.let { imageFromURL(binding.imgHolder, it) }
        imgData.tags?.let { binding.textView2.text = it }

        return binding.root
    }
}