package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_toast.*
import kotlinx.android.synthetic.main.custom_toast.*

class ToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        btnShowToast.setOnClickListener {
            Toast.makeText(applicationContext, "Hello world", Toast.LENGTH_LONG).show()
        }

        btnShowCustomToast.setOnClickListener {
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast, clToast)
                show()
            }
        }
    }
}