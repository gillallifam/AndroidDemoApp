package xyz.gillall.demoapp.ui.eventviewer

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import org.koin.androidx.viewmodel.ext.android.getViewModel
import xyz.gillall.demoapp.R
import xyz.gillall.demoapp.databinding.FragmentEventViewerBinding
import xyz.gillall.demoapp.model.CheckIn
import xyz.gillall.demoapp.model.SDEvent
import xyz.gillall.demoapp.util.Dialog
import xyz.gillall.demoapp.util.Image.imageWithPlaceholderFromURL

class EventViewer : Fragment() {
    private lateinit var eventId: String
    private lateinit var sDEvent: SDEvent
    private lateinit var binding: FragmentEventViewerBinding
    private lateinit var navController: NavController
    private lateinit var viewModel: EventViewerViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = getViewModel()
        arguments?.let {
            eventId = it.getString("eventId").toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_event_viewer, container, false)
        binding.lifecycleOwner = this
        navController = NavHostFragment.findNavController(this)
        setupEventFetch()
        setupCheckInAction()
        setupShareAction()
        return binding.root
    }

    private fun setupShareAction() {
        binding.imageShare.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, sDEvent.description)
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }
    }

    private fun setupCheckInAction() {
        binding.imageCheckin.setOnClickListener {
            val dialogCheckin =
                context?.let { Dialog.dialogCreate(it, R.layout.dialog_checkin, false) }

            dialogCheckin?.findViewById<TextView>(R.id.txtCheckYes)?.setOnClickListener {
                val name = dialogCheckin.findViewById<EditText>(R.id.editTextName).text.toString()
                val email = dialogCheckin.findViewById<EditText>(R.id.editTextEmail).text.toString()

                val hasData = name != "" && email != ""//todo validations

                if (hasData) {
                    viewModel.checkIn(CheckIn(eventId, "test1", "email@email.com"))
                    dialogCheckin.dismiss()
                } else {
                    Toast.makeText(context, "Preencha os campos.", Toast.LENGTH_SHORT).show()
                }
            }

            dialogCheckin?.findViewById<TextView>(R.id.txtCheckNo)?.setOnClickListener {
                dialogCheckin.dismiss()
            }

            dialogCheckin?.show()
        }
    }

    private fun setupEventFetch() {
        viewModel.event.observe(viewLifecycleOwner, {
            it.let {
                sDEvent = it
                imageWithPlaceholderFromURL(binding.imageViewViewer, it.image, R.drawable.defaultevent)
                binding.textView1.text = it.description
                binding.txtTitle.text = it.title
            }
        })
        viewModel.getEvent(eventId)
    }
}