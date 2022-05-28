package com.example.gemminer

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

class MainMenuActivity : AppCompatActivity() {
    private val fragmentManager = supportFragmentManager
    private val fragmentGlobal = MainMenuGlobalFragment()
    private val fragmentHeart = MainMenuHeartFragment()
    private val fragmentBasket = MainMenuBasketFragment()
    private val fragmentMypage = MainMenuMypageFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.menu_frame_layout, fragmentGlobal).commitAllowingStateLoss()
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.menu_bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener(ItemSelectedListener())
    }

    internal inner class ItemSelectedListener :
        BottomNavigationView.OnNavigationItemSelectedListener {
        override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
            val transaction = fragmentManager.beginTransaction()
            when (menuItem.itemId) {
                R.id.menu_global -> transaction.replace(R.id.menu_frame_layout, fragmentGlobal)
                    .commitAllowingStateLoss()
                R.id.menu_heart -> transaction.replace(R.id.menu_frame_layout, fragmentHeart)
                    .commitAllowingStateLoss()
                R.id.menu_basket -> transaction.replace(R.id.menu_frame_layout, fragmentBasket)
                    .commitAllowingStateLoss()
                R.id.menu_mypage -> transaction.replace(R.id.menu_frame_layout, fragmentMypage)
                    .commitAllowingStateLoss()
            }
            return true
        }
    }
}