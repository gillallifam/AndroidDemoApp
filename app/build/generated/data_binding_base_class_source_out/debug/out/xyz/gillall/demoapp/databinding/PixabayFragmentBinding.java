// Generated by data binding compiler. Do not edit!
package xyz.gillall.demoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;
import xyz.gillall.demoapp.R;
import xyz.gillall.demoapp.ui.pixabay.gallery.PixabayViewModel;

public abstract class PixabayFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final RecyclerView recyclePixabay;

  @Bindable
  protected PixabayViewModel mViewModel;

  protected PixabayFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout main, RecyclerView recyclePixabay) {
    super(_bindingComponent, _root, _localFieldCount);
    this.main = main;
    this.recyclePixabay = recyclePixabay;
  }

  public abstract void setViewModel(@Nullable PixabayViewModel viewModel);

  @Nullable
  public PixabayViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static PixabayFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.pixabay_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PixabayFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PixabayFragmentBinding>inflateInternal(inflater, R.layout.pixabay_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static PixabayFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.pixabay_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PixabayFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PixabayFragmentBinding>inflateInternal(inflater, R.layout.pixabay_fragment, null, false, component);
  }

  public static PixabayFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static PixabayFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (PixabayFragmentBinding)bind(component, view, R.layout.pixabay_fragment);
  }
}
