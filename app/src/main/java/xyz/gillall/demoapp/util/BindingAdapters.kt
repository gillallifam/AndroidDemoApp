package xyz.gillall.demoapp.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import xyz.gillall.demoapp.util.Image.imageFromURL

/**
 * Binding adapter used to display images from URL using Glide
 */
@BindingAdapter("imageUrl")
fun setImageURL(imageView: ImageView, url: String) {
    return imageFromURL(imageView, url)
}
