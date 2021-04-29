package io.naolarega.androidbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intents_and_activities_starting.*

class IntentsAndActivitiesStartingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents_and_activities_starting)

        btnGotoActivity.setOnClickListener {
            Intent(this, SecondActivity::class.java).also {
                startActivity(it)
            }
        }

        btnThirdActivity.setOnClickListener {
            Intent(this, ThirdActivity::class.java).also{
                startActivity(it)
            }
        }
    }
}