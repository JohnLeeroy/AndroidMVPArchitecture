package com.jli.mvpexample.adoptionlist.adapter

import androidx.recyclerview.widget.RecyclerView
import com.jli.mvpexample.adoptionlist.model.AdoptionEntry
import com.jli.mvpexample.databinding.AdoptionEntryViewholderBinding

class AdoptionEntryViewHolder(private val binding: AdoptionEntryViewholderBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(data: AdoptionEntry) {
        binding.nameLabel.text = "Name: ${data.name}"
        binding.ageLabel.text = "Age: ${data.age}"
        binding.animalType.text = "Animal: ${data.animal}"
    }

}