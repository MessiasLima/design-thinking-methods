package com.messias.designthinkingmethods

import androidx.fragment.app.Fragment

abstract class NoToolbarFragment : Fragment() {

    override fun onResume() {
        super.onResume()
       getMainActivity()?.supportActionBar?.hide()
    }

    override fun onPause() {
        super.onPause()
       getMainActivity()?.supportActionBar?.show()
    }

    private fun getMainActivity(): MainActivity? {
        return requireActivity() as? MainActivity
    }
}