package xyz.gillall.demoapp.ui.pixabay.videoviewer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.VideoView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import org.koin.androidx.viewmodel.ext.android.getViewModel
import xyz.gillall.demoapp.R
import xyz.gillall.demoapp.databinding.FragmentVideoViewerBinding
import xyz.gillall.demoapp.model.pixabay.VideoHit


class VideoViewer : Fragment() {
    private lateinit var videoData: VideoHit
    private lateinit var binding: FragmentVideoViewerBinding
    private lateinit var navController: NavController
    private lateinit var viewModel: VideoViewerViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = getViewModel()
        arguments?.let {
            videoData = it.getParcelable("hit")!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_video_viewer, container, false)
        binding.lifecycleOwner = this
        navController = NavHostFragment.findNavController(this)

        val videoView: VideoView = binding.videoView
        videoView.setVideoPath("https://player.vimeo.com/external/328940142.hd.mp4?s=1ea57040d1487a6c9d9ca9ca65763c8972e66bd4&profile_id=174")
        videoView.start()




        return binding.root
    }
}