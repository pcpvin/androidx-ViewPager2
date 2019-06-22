package com.serapbercin.viewpager2example.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serapbercin.viewpager2example.R
import kotlinx.android.synthetic.main.category_item.view.*

class CategoryViewHolder constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
    constructor(parent: ViewGroup) :
            this(LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false))

    fun bind(itemId: String) {
        itemView.test.text = itemId
    }

}