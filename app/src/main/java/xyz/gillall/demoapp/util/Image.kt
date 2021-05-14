package xyz.gillall.demoapp.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import xyz.gillall.demoapp.R


object Image {
    fun imageFromURL(imageView: ImageView, url: String) {
        Glide.with(imageView.context).load(url)
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .apply(RequestOptions().override(763, 400))
            .into(imageView)
    }

    fun imageWithPlaceholderFromURL(imageView: ImageView, url: String, placeholder: Int) {
        Glide.with(imageView.context).load(url)
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .placeholder(R.drawable.defaultevent)
            .apply(RequestOptions().override(763, 400))
            .into(imageView)
    }
}