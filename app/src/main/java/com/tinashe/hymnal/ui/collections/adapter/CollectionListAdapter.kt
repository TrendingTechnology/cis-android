package com.tinashe.hymnal.ui.collections.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.tinashe.hymnal.data.model.HymnCollectionModel

class CollectionListAdapter(
    private val callback: (Pair<HymnCollectionModel, View>) -> Unit
) :
    ListAdapter<HymnCollectionModel, CollectionHolder>(CollectionsDiff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionHolder {
        return CollectionHolder.create(parent)
    }

    override fun onBindViewHolder(holder: CollectionHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)

        holder.itemView.setOnClickListener { callback(item to it) }
    }
}
