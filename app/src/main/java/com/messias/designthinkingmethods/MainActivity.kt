package com.messias.designthinkingmethods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.messias.designthinkingmethods.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun hideToolbar() {
        binding.mainToolbar.visibility = View.GONE
    }

    fun showToolbar() {
        binding.mainToolbar.visibility = View.VISIBLE
    }
}