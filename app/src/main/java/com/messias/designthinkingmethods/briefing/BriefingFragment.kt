package com.messias.designthinkingmethods.briefing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.messias.designthinkingmethods.R
import com.messias.designthinkingmethods.ToolbarFragment

class BriefingFragment : ToolbarFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_briefing, container, false)
    }
}