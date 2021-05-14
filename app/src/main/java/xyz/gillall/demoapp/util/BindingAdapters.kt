package xyz.gillall.demoapp.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import xyz.gillall.demoapp.R
import xyz.gillall.demoapp.util.Image.imageFromURL
import xyz.gillall.demoapp.util.Image.imageWithPlaceholderFromURL

/**
 * Binding adapter used to display images from URL using Glide
 */
@BindingAdapter("imageUrl")
fun setImageURL(imageView: ImageView, url: String) {
    return imageFromURL(imageView, url)
}

@BindingAdapter("imagePlaceholderUrl")
fun setImagePlaceholderURL(imageView: ImageView, url: String) {
    return imageWithPlaceholderFromURL(imageView, url, R.drawable.defaultevent2)
}
