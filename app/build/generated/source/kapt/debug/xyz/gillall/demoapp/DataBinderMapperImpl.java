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
import xyz.gillall.demoapp.databinding.FragmentImageViewerBindingImpl;
import xyz.gillall.demoapp.databinding.HubFragmentBindingImpl;
import xyz.gillall.demoapp.databinding.PixabayFragmentBindingImpl;
import xyz.gillall.demoapp.databinding.PixabayItemBindingImpl;
import xyz.gillall.demoapp.databinding.SdeventViewBindingImpl;
import xyz.gillall.demoapp.databinding.SdeventsFragmentBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTEVENTVIEWER = 1;

  private static final int LAYOUT_FRAGMENTIMAGEVIEWER = 2;

  private static final int LAYOUT_HUBFRAGMENT = 3;

  private static final int LAYOUT_PIXABAYFRAGMENT = 4;

  private static final int LAYOUT_PIXABAYITEM = 5;

  private static final int LAYOUT_SDEVENTVIEW = 6;

  private static final int LAYOUT_SDEVENTSFRAGMENT = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.fragment_event_viewer, LAYOUT_FRAGMENTEVENTVIEWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.fragment_image_viewer, LAYOUT_FRAGMENTIMAGEVIEWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.hub_fragment, LAYOUT_HUBFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.pixabay_fragment, LAYOUT_PIXABAYFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.pixabay_item, LAYOUT_PIXABAYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(xyz.gillall.demoapp.R.layout.sdevent_view, LAYOUT_SDEVENTVIEW);
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
        case  LAYOUT_FRAGMENTIMAGEVIEWER: {
          if ("layout/fragment_image_viewer_0".equals(tag)) {
            return new FragmentImageViewerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_image_viewer is invalid. Received: " + tag);
        }
        case  LAYOUT_HUBFRAGMENT: {
          if ("layout/hub_fragment_0".equals(tag)) {
            return new HubFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for hub_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_PIXABAYFRAGMENT: {
          if ("layout/pixabay_fragment_0".equals(tag)) {
            return new PixabayFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for pixabay_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_PIXABAYITEM: {
          if ("layout/pixabay_item_0".equals(tag)) {
            return new PixabayItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for pixabay_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SDEVENTVIEW: {
          if ("layout/sdevent_view_0".equals(tag)) {
            return new SdeventViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for sdevent_view is invalid. Received: " + tag);
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
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/fragment_event_viewer_0", xyz.gillall.demoapp.R.layout.fragment_event_viewer);
      sKeys.put("layout/fragment_image_viewer_0", xyz.gillall.demoapp.R.layout.fragment_image_viewer);
      sKeys.put("layout/hub_fragment_0", xyz.gillall.demoapp.R.layout.hub_fragment);
      sKeys.put("layout/pixabay_fragment_0", xyz.gillall.demoapp.R.layout.pixabay_fragment);
      sKeys.put("layout/pixabay_item_0", xyz.gillall.demoapp.R.layout.pixabay_item);
      sKeys.put("layout/sdevent_view_0", xyz.gillall.demoapp.R.layout.sdevent_view);
      sKeys.put("layout/sdevents_fragment_0", xyz.gillall.demoapp.R.layout.sdevents_fragment);
    }
  }
}
