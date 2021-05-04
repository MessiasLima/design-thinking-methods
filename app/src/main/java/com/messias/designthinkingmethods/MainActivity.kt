package com.messias.designthinkingmethods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import android.widget.PopupMenu
import android.widget.PopupWindow
import com.messias.designthinkingmethods.databinding.ActivityMainBinding
import com.messias.designthinkingmethods.databinding.FragmentHomeBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupNavigationIconToolbar()
    }

    private fun setupNavigationIconToolbar() {
        //registerForContextMenu(binding.mainToolbarButton)

        val b = FragmentHomeBinding.inflate(layoutInflater, null, false)

        val ppWindow = PopupWindow(
            b.root,
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT,
            true
        )

        b.homeButton.setOnClickListener {
            Log.i("Esta merda", "esta merga deu bom")
            ppWindow.dismiss()
        }


        val popupMenu =
            PopupMenu(this, binding.mainToolbarButton, Gravity.TOP, 0, R.style.ContextMenu)
        popupMenu.menuInflater.inflate(R.menu.main_menu, popupMenu.menu)

        binding.mainToolbarButton.setOnClickListener {
            //binding.mainToolbarButton.showContextMenu(0f, 0f)
            //popupMenu.show()
            ppWindow.showAsDropDown(it, 0, -100, Gravity.TOP)
        }
    }

    fun hideToolbar() {
        binding.mainToolbar.visibility = View.GONE
    }

    fun showToolbar() {
        binding.mainToolbar.visibility = View.VISIBLE
    }
//
//    override fun onCreateContextMenu(
//        menu: ContextMenu?,
//        view: View?,
//        menuInfo: ContextMenu.ContextMenuInfo?
//    ) {
//        super.onCreateContextMenu(menu, view, menuInfo)
//        menuInflater.inflate(R.menu.main_menu, menu)
//    }
}