package io.naolarega.androidbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_passing_data.*
import java.io.Serializable

class PassingDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passing_data)

        btnDone.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val country= etCountry.text.toString()

            val personInstance = Person(name, age, country)

            Intent(this, RecieverActivity::class.java).also{
                it.putExtra("EXTRA_NAME", name)
                it.putExtra("EXTRA_AGE", age)
                it.putExtra("EXTRA_COUNTRY", country)

                it.putExtra("EXTRA_PERSON", personInstance)

                startActivity(it)
            }
        }
    }
}