package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        print("-> activity started")
    }

    override fun onResume() {
        super.onResume()
        print("-> activity resumed")
    }

    override fun onPause() {
        super.onPause()
        print("-> activity paused")
    }

    override fun onStop() {
        super.onStop()
        print("-> activity stopped")
    }

    override fun onRestart() {
        super.onRestart()
        print("-> activity restarting")
    }
}