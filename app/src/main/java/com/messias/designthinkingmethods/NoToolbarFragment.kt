package com.messias.designthinkingmethods

import androidx.fragment.app.Fragment

abstract class NoToolbarFragment : Fragment() {

    override fun onResume() {
        super.onResume()
        getMainActivity()?.hideToolbar()
    }

    override fun onPause() {
        super.onPause()
        getMainActivity()?.showToolbar()
    }

    private fun getMainActivity(): MainActivity? {
        return requireActivity() as? MainActivity
    }
}