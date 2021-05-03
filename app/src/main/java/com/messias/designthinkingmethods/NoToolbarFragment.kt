package com.messias.designthinkingmethods

abstract class NoToolbarFragment : BaseFragment() {
    override fun onResume() {
        super.onResume()
        getMainActivity()?.hideToolbar()
    }
}