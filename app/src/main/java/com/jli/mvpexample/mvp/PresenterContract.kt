package com.jli.mvpexample.mvp

interface PresenterContract<VIEW> {
    fun attach(view: VIEW, retainedState: RetainedState)
    fun detach()
    fun onViewAttached()
    fun onViewDetached()
}