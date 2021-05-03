package com.messias.designthinkingmethods.briefing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.messias.designthinkingmethods.NoToolbarFragment
import com.messias.designthinkingmethods.R
import com.messias.designthinkingmethods.databinding.FragmentBriefingTitleBinding

class BriefingTitleFragment : NoToolbarFragment() {
    lateinit var binding: FragmentBriefingTitleBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBriefingTitleBinding.inflate(inflater, container, false)
        binding.briefingButton.setOnClickListener {
            findNavController().navigate(BriefingTitleFragmentDirections.briefing())
        }
        return binding.root
    }
}