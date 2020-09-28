package com.jli.mvpexample.mvp

interface BaseView<PRESENTER> {
    fun getPresenter(): PRESENTER
}