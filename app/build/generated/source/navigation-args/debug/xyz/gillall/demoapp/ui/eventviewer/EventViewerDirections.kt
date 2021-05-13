package xyz.gillall.demoapp.ui.eventviewer

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import xyz.gillall.demoapp.R

public class EventViewerDirections private constructor() {
  public companion object {
    public fun actionEventViewerToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_eventViewer_to_mainFragment)
  }
}
