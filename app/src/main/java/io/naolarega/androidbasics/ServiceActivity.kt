package io.naolarega.androidbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_service.*

class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        btnStartGenericService.setOnClickListener {
            Intent(this, AnotherRandomService::class.java).also {
                startService(it)
                tvGenericServiceStatus.setText("Service Started")
            }
        }

        btnStopGenericService.setOnClickListener {
            Intent(this, AnotherRandomService::class.java).also {
                stopService(it)
                tvGenericServiceStatus.setText("Service Stopped")
            }
        }

        btnSendDataToService.setOnClickListener {
            Intent(this, AnotherRandomService::class.java).also {
                val dataToSend = etDataToService.text.toString()
                it.putExtra("SERVICE_DATA", dataToSend)
                startService(it)
            }
        }
    }
}