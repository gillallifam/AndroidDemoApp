package xyz.gillall.demoapp.ui.hub

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import xyz.gillall.demoapp.R

public class HubFragmentDirections private constructor() {
  public companion object {
    public fun actionHubFragmentToPixabayFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_hubFragment_to_pixabayFragment)

    public fun actionHubFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_hubFragment_to_mainFragment)

    public fun actionHubFragmentToVideoGalleryFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_hubFragment_to_videoGalleryFragment)

    public fun actionHubFragmentToVideoViewer(): NavDirections =
        ActionOnlyNavDirections(R.id.action_hubFragment_to_videoViewer)
  }
}
