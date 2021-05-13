// Generated by data binding compiler. Do not edit!
package xyz.gillall.demoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import xyz.gillall.demoapp.R;
import xyz.gillall.demoapp.model.Hit;
import xyz.gillall.demoapp.ui.pixabay.gallery.HitClickListener;

public abstract class PixabayItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView newsImage;

  @NonNull
  public final TextView txtDesc;

  @NonNull
  public final TextView txtTitle;

  @Bindable
  protected Hit mItem;

  @Bindable
  protected HitClickListener mClickListener;

  protected PixabayItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView newsImage, TextView txtDesc, TextView txtTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.newsImage = newsImage;
    this.txtDesc = txtDesc;
    this.txtTitle = txtTitle;
  }

  public abstract void setItem(@Nullable Hit item);

  @Nullable
  public Hit getItem() {
    return mItem;
  }

  public abstract void setClickListener(@Nullable HitClickListener clickListener);

  @Nullable
  public HitClickListener getClickListener() {
    return mClickListener;
  }

  @NonNull
  public static PixabayItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.pixabay_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PixabayItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PixabayItemBinding>inflateInternal(inflater, R.layout.pixabay_item, root, attachToRoot, component);
  }

  @NonNull
  public static PixabayItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.pixabay_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PixabayItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PixabayItemBinding>inflateInternal(inflater, R.layout.pixabay_item, null, false, component);
  }

  public static PixabayItemBinding bind(@NonNull View view) {
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
  public static PixabayItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (PixabayItemBinding)bind(component, view, R.layout.pixabay_item);
  }
}
