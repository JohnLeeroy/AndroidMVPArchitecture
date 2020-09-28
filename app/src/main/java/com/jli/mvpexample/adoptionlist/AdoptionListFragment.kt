package com.jli.mvpexample.adoptionlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.jli.mvpexample.adoptionlist.adapter.AdoptionListAdapter
import com.jli.mvpexample.adoptionlist.model.AdoptionEntry
import com.jli.mvpexample.adoptionlist.model.FakeAdoptionRepository
import com.jli.mvpexample.databinding.AdoptionListBinding
import com.jli.mvpexample.mvp.MVPLifecycleObserver
import com.jli.mvpexample.mvp.RetainedState

class AdoptionListFragment : Fragment(), AdoptionListView {

    private val lazyPresenter by lazy { AdoptionListPresenter(FakeAdoptionRepository()) }
    private val retainedState: RetainedState by viewModels()
    private lateinit var lifeCycleObserver: MVPLifecycleObserver<AdoptionListView, AdoptionListPresenter>

    private val adapter = AdoptionListAdapter()

    private lateinit var binding: AdoptionListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AdoptionListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.adapter = adapter
        lifeCycleObserver = MVPLifecycleObserver(this, getPresenter(), retainedState)
        viewLifecycleOwner.lifecycle.addObserver(lifeCycleObserver)
    }

    override fun getPresenter(): AdoptionListPresenter = lazyPresenter

    override fun addAdoptionEntries(adoptionEntries: List<AdoptionEntry>) {
        adapter.addEntries(adoptionEntries)
    }
}