package com.messias.designthinkingmethods

import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {
    protected fun getMainActivity(): MainActivity? {
        return requireActivity() as? MainActivity
    }
}