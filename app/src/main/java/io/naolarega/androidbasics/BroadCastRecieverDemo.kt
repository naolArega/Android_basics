package io.naolarega.androidbasics

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BroadCastRecieverDemo : AppCompatActivity() {

    lateinit var reciever: AirplaneChangeReciever

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broad_cast_reciever)

        reciever = AirplaneChangeReciever()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(reciever, it)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(reciever)
    }
}