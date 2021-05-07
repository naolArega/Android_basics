package io.naolarega.androidbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_service.*

class IntentServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_service)

        btnStartService.setOnClickListener {
            Intent(this, SomeRandomService::class.java).also {
                startService(it)
                tvServiceStatus.setText("Service Started")
            }
        }

        btnStopService.setOnClickListener {
            SomeRandomService.stopService()
            tvServiceStatus.setText("Service Stopped")
        }
    }
}