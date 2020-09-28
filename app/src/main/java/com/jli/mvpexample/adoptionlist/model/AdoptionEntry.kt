package com.jli.mvpexample.adoptionlist.model

data class AdoptionEntry(
    val id: Long,
    val name: String,
    val age: Int,
    val animal: AnimalType
)