package xyz.gillall.demoapp.ui.pixabay.gallery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import xyz.gillall.demoapp.databinding.PixabayItemBinding
import xyz.gillall.demoapp.model.Hit

class PixabayAdapter(private val clickListener: HitClickListener):
    ListAdapter<Hit, PixabayAdapter.ViewHolder>(ItemDiffCallback()) {

    class ViewHolder private constructor(private val binding: PixabayItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Hit, clickListener: HitClickListener) {
            binding.item = item
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = PixabayItemBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position)!!, clickListener)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }
}

class ItemDiffCallback : DiffUtil.ItemCallback<Hit>() {
    override fun areItemsTheSame(oldItem: Hit, newItem: Hit): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Hit, newItem: Hit): Boolean {
        return oldItem == newItem
    }
}

class HitClickListener(val clickListener: (event: Hit, view: View) -> Unit) {
    fun onClick(hit: Hit, view: View) = clickListener(hit, view)
}