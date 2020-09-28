package com.jli.mvpexample.adoptionlist

import android.util.Log
import com.jli.mvpexample.adoptionlist.model.AdoptionRepository
import com.jli.mvpexample.mvp.BasePresenter

open class AdoptionListPresenter(private val adoptionRepo: AdoptionRepository) :
    BasePresenter<AdoptionListView>() {

    override fun onViewAttached() {
        super.onViewAttached()
        Log.d(TAG, "$TAG attached")
        val adoptionEntries = adoptionRepo.getAllAdoptionEntries()
        view?.addAdoptionEntries(adoptionEntries)
    }

    override fun onViewDetached() {
        super.onViewDetached()
        Log.d(TAG, "$TAG detached")
    }

    private companion object {
        const val TAG = "AdoptionListPresenter"
    }
}
