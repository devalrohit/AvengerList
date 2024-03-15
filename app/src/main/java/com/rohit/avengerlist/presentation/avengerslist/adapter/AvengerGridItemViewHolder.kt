package com.rohit.avengerlist.presentation.avengersgrid.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.rohit.avengerlist.base.ViewHolderBinder
import com.rohit.avengerlist.data.model.Avenger
import com.rohit.avengerlist.databinding.ItemAvengerGridBinding

class AvengerGridItemViewHolder(
    private val binding: ItemAvengerGridBinding
) : ViewHolder(binding.root), ViewHolderBinder<Avenger> {

    override fun bind(item: Avenger) {
        item.let {
            binding.ivAvengersPhoto.load(it.profilePicUrl) {
                crossfade(true)
                //error(R.mipmap.ic_laucher)
            }
            binding.tvAvengerName.text = it.name
        }
    }
}