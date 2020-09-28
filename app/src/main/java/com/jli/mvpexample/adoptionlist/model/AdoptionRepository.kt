package com.jli.mvpexample.adoptionlist.model

interface AdoptionRepository {

    fun getAllAdoptionEntries(): List<AdoptionEntry>
}

