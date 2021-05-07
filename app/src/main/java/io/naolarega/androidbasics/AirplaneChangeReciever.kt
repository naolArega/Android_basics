package io.naolarega.androidbasics

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneChangeReciever : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        val isAirplaneModeEnabled = p1?.getBooleanExtra("state", false) ?: return
        if(isAirplaneModeEnabled){
            Toast.makeText(p0, "Airplane mode is enabled", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(p0, "Airplane mode is disabled", Toast.LENGTH_LONG).show()
        }
    }
}