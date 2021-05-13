package xyz.gillall.demoapp.ui.pixabay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import xyz.gillall.demoapp.util.Dialog
import com.google.android.gms.maps.MapView
import org.koin.androidx.viewmodel.ext.android.getViewModel
import xyz.gillall.demoapp.R
import xyz.gillall.demoapp.databinding.PixabayFragmentBinding
import xyz.gillall.demoapp.databinding.SdeventsFragmentBinding


class PixabayFragment : Fragment() {

    private lateinit var binding: PixabayFragmentBinding
    private lateinit var navController: NavController
    private lateinit var viewModel: PixabayViewModel
    //private lateinit var sDEventsAdapter: SDEventsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = getViewModel()
        binding = DataBindingUtil.inflate(inflater, R.layout.pixabay_fragment, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        navController = findNavController(this)
        Toast.makeText(context,"PixabayFragment",Toast.LENGTH_LONG).show()
        return binding.root
    }
}