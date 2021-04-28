package io.naolarega.androidbasics

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_image_view.*

class ImageViewActivity : AppCompatActivity() {
    val PREV = -1
    val NEXT = 1
    var currentImage = 0

    val images = arrayOf<Int>(
        R.drawable.blender_open_movie,
        R.drawable.blender_open_movie_2,
        R.drawable.blender_open_movie_3
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

        ivImages.setImageResource(images[currentImage])

        btnNext.setOnClickListener {
            switchImages(NEXT)
        }

        btnPrev.setOnClickListener {
            switchImages(PREV)
        }
    }

    private fun switchImages(where: Int){
        currentImage += where
        if(currentImage == images.size){
            currentImage = 0
        }
        else if(currentImage == -1){
            currentImage = images.size - 1
        }
        ivImages.setImageResource(images[currentImage])
    }
}