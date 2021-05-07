package io.naolarega.androidbasics

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import java.security.Provider

class AnotherRandomService : Service() {

    val SERVICE_LOG_TAB = "RANDOM_SERVICE"

    init{
        Log.d(SERVICE_LOG_TAB, "Service is Running...")
    }

    override fun onBind(p0: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val dataString = intent?.getStringExtra("SERVICE_DATA")
        dataString?.let{
            Log.d(SERVICE_LOG_TAB, "the data is : $dataString")
        }

        Thread{
            while(true){

            }
        }.start()
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(SERVICE_LOG_TAB, "Service is being killed...")
    }
}