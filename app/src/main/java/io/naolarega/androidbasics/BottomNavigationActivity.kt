package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        setFragment(FirstFragment())

        bnvActions.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miHome -> setFragment(FirstFragment())
                R.id.miMessage -> setFragment(SecondFragment())
                R.id.miContact -> setFragment(ThirdFragment())
            }

            true
        }

        bnvActions.getOrCreateBadge(R.id.miHome).apply {
            number = 18
        }
    }

    private fun setFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragmentHolder, fragment)
            addToBackStack(null)
            commit()
        }
    }
}