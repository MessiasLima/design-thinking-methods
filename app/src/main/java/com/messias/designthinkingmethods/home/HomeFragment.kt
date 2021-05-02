package com.messias.designthinkingmethods.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.messias.designthinkingmethods.NoToolbarFragment
import com.messias.designthinkingmethods.R
import com.messias.designthinkingmethods.databinding.FragmentHomeBinding

class HomeFragment : NoToolbarFragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.homeButton.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.briefingTitle())
        }
    }
}