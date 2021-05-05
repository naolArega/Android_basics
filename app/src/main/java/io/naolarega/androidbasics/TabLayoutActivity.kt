package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_tab_layout.*

class TabLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        val tabContents = listOf(
            R.drawable.blender_open_movie,
            R.drawable.blender_open_movie_2,
            R.drawable.blender_open_movie_3
        )

        val tabAdapter = TabLayouAdapter(tabContents)

        vpTabContent.adapter = tabAdapter

        TabLayoutMediator(tlImageTab, vpTabContent) { tab, position ->
            tab.text = "Image ${position + 1}"
        }.attach()

        tlImageTab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@TabLayoutActivity, "You have selected ${tab?.text}", Toast.LENGTH_LONG).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@TabLayoutActivity, "You have left ${tab?.text}", Toast.LENGTH_LONG).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@TabLayoutActivity, "You have selected ${tab?.text} again", Toast.LENGTH_LONG).show()
            }

        })
    }
}