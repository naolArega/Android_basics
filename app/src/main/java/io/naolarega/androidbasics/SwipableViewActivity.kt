package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_swipable_view.*

class SwipableViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipable_view)

        val images = listOf(
            R.drawable.blender_open_movie,
            R.drawable.blender_open_movie_2,
            R.drawable.blender_open_movie_3
        )

        val adapter = ViewPagerAdapter(images)

        vpView.adapter = adapter
        vpView.orientation = ViewPager2.ORIENTATION_VERTICAL
    }
}