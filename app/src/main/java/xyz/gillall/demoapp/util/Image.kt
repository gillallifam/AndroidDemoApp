package xyz.gillall.demoapp.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import xyz.gillall.demoapp.R


object Image {
    fun imageFromURL(imageView: ImageView, url: String) {
        Glide.with(imageView.context).load(url)
            //.placeholder(R.drawable.defaultevent2)
            .apply(RequestOptions().override(763, 400))
            .into(imageView)
    }
}