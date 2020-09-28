package com.jli.mvpexample.adoptionlist.adapter

import androidx.recyclerview.widget.DiffUtil
import com.jli.mvpexample.adoptionlist.model.AdoptionEntry

class AdoptionEntryDiffUtil(
    private val oldList: List<AdoptionEntry>,
    private val newList: List<AdoptionEntry>
) :
    DiffUtil.Callback() {
    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList == newList
    }
}