package com.example.gemminer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.gemminer.databinding.ActivityHomeBinding
import com.example.gemminer.databinding.FragmentArtistDetailBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity() {

    lateinit var homebinding:ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        homebinding = ActivityHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(homebinding.root)


        initNavigationBar()

    }

    fun initNavigationBar() {
        homebinding.Smenu.run {
            setOnItemSelectedListener {
                when(it.itemId) {
                    R.id.menu_global->{
                        changeFragment(MainMenuGlobalFragment())
                    }
                    R.id.menu_heart ->{
                        changeFragment(MainMenuHeartFragment())
                    }
                    R.id.menu_basket ->{
                        changeFragment(MainMenuBasketFragment())
                    }
                    R.id.menu_mypage->{
                        changeFragment(MainMenuMypageFragment())
                    }
                }
                true
            }
            selectedItemId=R.id.menu_global
        }
    }

    fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(homebinding.container.id,fragment).commit()
    }

    override fun onSupportNavigateUp(): Boolean {
        val TAG="Debug"
        Log.d(TAG, "Up Clicked")
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    fun btnFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, fragment).commit()
    }


}