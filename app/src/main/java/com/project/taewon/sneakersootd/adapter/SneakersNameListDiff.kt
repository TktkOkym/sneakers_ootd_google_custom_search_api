package com.project.taewon.sneakersootd.adapter

import androidx.recyclerview.widget.DiffUtil
import com.project.taewon.sneakersootd.model.ModelNameItem

class SneakersNameListDiff : DiffUtil.ItemCallback<ModelNameItem>() {
    override fun areItemsTheSame(
        oldItem: ModelNameItem,
        newItem: ModelNameItem
    ): Boolean {
        return oldItem.name == newItem.name // check uniqueness
    }

    override fun areContentsTheSame(
        oldItem: ModelNameItem,
        newItem: ModelNameItem
    ): Boolean {
        return oldItem == newItem // check contents
    }
}