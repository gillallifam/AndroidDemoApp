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
import xyz.gillall.demoapp.R
import xyz.gillall.demoapp.databinding.FragmentImageViewerBinding
import xyz.gillall.demoapp.model.pixabay.ImageHit
import xyz.gillall.demoapp.util.Image.imageFromURL


class ImageViewer : Fragment() {
    private lateinit var imgData: ImageHit
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


        //var shake = AnimationUtils.loadAnimation(context, R.anim.shake);
        /*val anim = RotateAnimation(0f, 350f, 15f, 15f)
        anim.interpolator = LinearInterpolator()
        anim.repeatCount = Animation.INFINITE
        anim.duration = 700*/

        binding.imgHolder.post{
            imgData.webformatURL?.let { imageFromURL(binding.imgHolder, it) }

            imgData.tags?.let { binding.textView2.text = it }
            //binding.imgHolder.startAnimation(anim);
        }


        return binding.root
    }
}