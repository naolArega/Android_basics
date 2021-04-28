package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_text_views.*

class TextViewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_views)

        var timer = 0
        btnAddOne.setOnClickListener {
            timer += 1
            tvTimer.text = "Time elapsed: $timer"
        }
    }
}