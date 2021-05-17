package xyz.gillall.demoapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import xyz.gillall.demoapp.databinding.FragmentEventViewerBindingImpl;
import xyz.gillall.demoapp.databinding.FragmentHubBindingImpl;
import xyz.gillall.demoapp.databinding.FragmentImageGalleryBindingImpl;
import xyz.gillall.demoapp.databinding.FragmentImageViewerBindingImpl;
import xyz.gillall.demoapp.databinding.FragmentVideoGalleryBindingImpl;
import xyz.gillall.demoapp.databinding.FragmentVideoViewerBindingImpl;
import xyz.gillall.demoapp.databinding.PixabayItemBindingImpl;
import xyz.gillall.demoapp.databinding.SdeventRecycleItemBindingImpl;
import xyz.gillall.demoapp.databinding.SdeventsFragmentBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTEVENTVIEWER = 1;

  private static final int LAYOUT_FRAGMENTHUB = 2;

  private static final int LAYOUT_FRAGMENTIMAGEGALLERY = 3;

  private static final int LAYOUT_FRAGMENTIMAGEVIEWER = 4;

  private static final int LAYOUT_FRAGMENTVIDEOGALLERY = 5;

  private static final int LAYOUT_FRAGMENTVIDEOVIEWER = 6;

  private static final int LAYOUT_PIXABAYITEM = 7;

  private static final int LAYOUT_SDEVENTRECYCLEITEM = 8;

  private static final int LAYOUT_SDEVENTSFRAGMENT = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.fragment_event_viewer, LAYOUT_FRAGMENTEVENTVIEWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.fragment_hub, LAYOUT_FRAGMENTHUB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.fragment_image_gallery, LAYOUT_FRAGMENTIMAGEGALLERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.fragment_image_viewer, LAYOUT_FRAGMENTIMAGEVIEWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.fragment_video_gallery, LAYOUT_FRAGMENTVIDEOGALLERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.fragment_video_viewer, LAYOUT_FRAGMENTVIDEOVIEWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.pixabay_item, LAYOUT_PIXABAYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.sdevent_recycle_item, LAYOUT_SDEVENTRECYCLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.sdevents_fragment, LAYOUT_SDEVENTSFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTEVENTVIEWER: {
          if ("layout/fragment_event_viewer_0".equals(tag)) {
            return new FragmentEventViewerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_event_viewer is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHUB: {
          if ("layout/fragment_hub_0".equals(tag)) {
            return new FragmentHubBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_hub is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTIMAGEGALLERY: {
          if ("layout/fragment_image_gallery_0".equals(tag)) {
            return new FragmentImageGalleryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_image_gallery is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTIMAGEVIEWER: {
          if ("layout/fragment_image_viewer_0".equals(tag)) {
            return new FragmentImageViewerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_image_viewer is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVIDEOGALLERY: {
          if ("layout/fragment_video_gallery_0".equals(tag)) {
            return new FragmentVideoGalleryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_video_gallery is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVIDEOVIEWER: {
          if ("layout/fragment_video_viewer_0".equals(tag)) {
            return new FragmentVideoViewerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_video_viewer is invalid. Received: " + tag);
        }
        case  LAYOUT_PIXABAYITEM: {
          if ("layout/pixabay_item_0".equals(tag)) {
            return new PixabayItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for pixabay_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SDEVENTRECYCLEITEM: {
          if ("layout/sdevent_recycle_item_0".equals(tag)) {
            return new SdeventRecycleItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for sdevent_recycle_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SDEVENTSFRAGMENT: {
          if ("layout/sdevents_fragment_0".equals(tag)) {
            return new SdeventsFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for sdevents_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "clickListener");
      sKeys.put(2, "defimage");
      sKeys.put(3, "event");
      sKeys.put(4, "item");
      sKeys.put(5, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/fragment_event_viewer_0", xyz.gillall.demoapp.R.layout.fragment_event_viewer);
      sKeys.put("layout/fragment_hub_0", xyz.gillall.demoapp.R.layout.fragment_hub);
      sKeys.put("layout/fragment_image_gallery_0", xyz.gillall.demoapp.R.layout.fragment_image_gallery);
      sKeys.put("layout/fragment_image_viewer_0", xyz.gillall.demoapp.R.layout.fragment_image_viewer);
      sKeys.put("layout/fragment_video_gallery_0", xyz.gillall.demoapp.R.layout.fragment_video_gallery);
      sKeys.put("layout/fragment_video_viewer_0", xyz.gillall.demoapp.R.layout.fragment_video_viewer);
      sKeys.put("layout/pixabay_item_0", xyz.gillall.demoapp.R.layout.pixabay_item);
      sKeys.put("layout/sdevent_recycle_item_0", xyz.gillall.demoapp.R.layout.sdevent_recycle_item);
      sKeys.put("layout/sdevents_fragment_0", xyz.gillall.demoapp.R.layout.sdevents_fragment);
    }
  }
}
