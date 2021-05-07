package io.naolarega.androidbasics

import android.app.IntentService
import android.content.Intent
import android.util.Log

class SomeRandomService : IntentService("SomeRandomService") {

    init{
        instance = this
    }

    companion object{
        private lateinit var instance: SomeRandomService
        var isRunning = false

        fun stopService(){
            Log.d("STOPPING_SERVICES", "service is stopping...")
            isRunning = false
            instance.stopSelf()
        }
    }

    override fun onHandleIntent(p0: Intent?) {
        try{
            isRunning = true
            while(isRunning){
                Log.d("RUNNING_SERVICES", "service is running...")
                Thread.sleep(1000)
            }
        }
        catch(e: InterruptedException){
            Thread.currentThread().interrupt()
        }
    }
}