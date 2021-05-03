package com.messias.designthinkingmethods

abstract class ToolbarFragment : BaseFragment() {
    override fun onResume() {
        super.onResume()
        getMainActivity()?.showToolbar()
    }
}