package xyz.gillall.demoapp.ui.sd.events

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import xyz.gillall.demoapp.databinding.SdeventRecycleItemBinding
import xyz.gillall.demoapp.model.sd.SDEvent

class SDEventsAdapter(private val clickListener: SDEventClickListener):
    ListAdapter<SDEvent, SDEventsAdapter.ViewHolder>(NewsDiffCallback()) {

    class ViewHolder private constructor(private val binding: SdeventRecycleItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: SDEvent, clickListener: SDEventClickListener) {
            binding.item = item
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = SdeventRecycleItemBinding.inflate(layoutInflater, parent, false)
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

class NewsDiffCallback : DiffUtil.ItemCallback<SDEvent>() {
    override fun areItemsTheSame(oldItem: SDEvent, newItem: SDEvent): Boolean {
        return oldItem.title == newItem.title
    }

    override fun areContentsTheSame(oldItem: SDEvent, newItem: SDEvent): Boolean {
        return oldItem == newItem
    }
}

class SDEventClickListener(val clickListener: (event: SDEvent, view: View) -> Unit) {
    fun onClick(event: SDEvent, view: View) = clickListener(event, view)
}