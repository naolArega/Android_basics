package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf(9, 5, 2, 8, 1, 3)
        sortList(list)
        Log.d("MainActivity :", "printing a sorted list $list")
    }

    private fun sortList(list: List<Int>){
        for(i in 0..list.size - 1){
            for(j in 0..list.size - 2){
                if (list[j] > list[j + 1]) {
                    Collections.swap(list, j, j + 1)
                }
            }
        }
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