package xyz.gillall.demoapp.ui.sdevents

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import xyz.gillall.demoapp.R

public class SDEventsFragmentDirections private constructor() {
  public companion object {
    public fun actionMainFragmentToEventViewer(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_eventViewer)
  }
}
