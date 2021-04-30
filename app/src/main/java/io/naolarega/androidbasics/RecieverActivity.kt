package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_reciever.*

class RecieverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reciever)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE", 0)
        val country = intent.getStringExtra("EXTRA_COUNTRY")

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person

        val personalData = "You're name is $name, $age years old, who lives in $country"

        Toast.makeText(this, "Data received :: ${person.toString()}", Toast.LENGTH_LONG).show()
        tvPersonalData.text = personalData
    }
}