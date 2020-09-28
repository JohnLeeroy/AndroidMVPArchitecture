package com.jli.mvpexample.adoptionlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.jli.mvpexample.adoptionlist.model.AdoptionEntry
import com.jli.mvpexample.databinding.AdoptionEntryViewholderBinding


class AdoptionListAdapter : RecyclerView.Adapter<AdoptionEntryViewHolder>() {

    private val adoptionEntries = mutableListOf<AdoptionEntry>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdoptionEntryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AdoptionEntryViewholderBinding.inflate(
            inflater,
            parent,
            false
        )
        return AdoptionEntryViewHolder(binding)
    }

    override fun getItemCount(): Int = adoptionEntries.size

    override fun onBindViewHolder(holder: AdoptionEntryViewHolder, position: Int) {
        holder.bind(adoptionEntries[position])
    }

    fun addEntries(entries: List<AdoptionEntry>) {
        val diffResult = DiffUtil.calculateDiff(
            AdoptionEntryDiffUtil(
                adoptionEntries,
                entries
            )
        )
        adoptionEntries.clear()
        adoptionEntries.addAll(entries)
        diffResult.dispatchUpdatesTo(this)
    }
}

