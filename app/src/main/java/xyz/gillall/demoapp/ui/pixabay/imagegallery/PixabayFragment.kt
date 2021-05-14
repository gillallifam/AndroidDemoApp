package xyz.gillall.demoapp.ui.pixabay.imagegallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import org.koin.androidx.viewmodel.ext.android.getSharedViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel
import xyz.gillall.demoapp.R
import xyz.gillall.demoapp.databinding.PixabayFragmentBinding
import xyz.gillall.demoapp.ui.pixabay.ImageType
import xyz.gillall.demoapp.ui.pixabay.VideoType


class PixabayFragment : Fragment() {

    private lateinit var binding: PixabayFragmentBinding
    private lateinit var navController: NavController
    private lateinit var viewModel: PixabayViewModel
    private lateinit var hitsAdapter: PixabayAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = getSharedViewModel()
        binding = DataBindingUtil.inflate(inflater, R.layout.pixabay_fragment, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        navController = findNavController(this)
        setupHits()
        return binding.root
    }

    private fun setupHits() {
        hitsAdapter = PixabayAdapter(HitClickListener() { hit, view ->
            val bundle = Bundle()
            bundle.putParcelable("hit", hit)
            navController.navigate(R.id.action_pixabayFragment_to_imageViewer, bundle)
        })
        binding.recyclePixabay.adapter = hitsAdapter
        binding.recyclePixabay.layoutManager =
            GridLayoutManager(activity, 2, GridLayoutManager.VERTICAL, false)
        viewModel.imagehits.observe(viewLifecycleOwner, {
            hitsAdapter.submitList(it.hits)
            binding.recyclePixabay.scheduleLayoutAnimation()
        })
        viewModel.getImages("random", ImageType.PHOTO.type, "10")
        //viewModel.getVideos("flower", VideoType.FILM.type, "10")
    }
}