package com.jli.mvpexample.adoptionlist

import com.jli.mvpexample.adoptionlist.model.AdoptionEntry
import com.jli.mvpexample.mvp.BaseView

interface AdoptionListView : BaseView<AdoptionListPresenter> {

    fun addAdoptionEntries(adoptionEntries: List<AdoptionEntry>)
}