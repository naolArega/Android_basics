package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_passing_data.*
import kotlinx.android.synthetic.main.activity_saving_data.*

class SavingDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saving_data)

        val sharedPrefs = getSharedPreferences("myPref", MODE_PRIVATE)
        val editor = sharedPrefs.edit()

        btnSave.setOnClickListener {
            val name = etNameInput.text.toString()
            val age = etAgeInput.text.toString().toInt()
            val adult = cbAdult.isChecked

            editor.apply{
                putString("name", name)
                putInt("age", age)
                putBoolean("adult", adult)
                apply()
            }
        }

        btnLoad.setOnClickListener {
            val name = sharedPrefs.getString("name", null)
            val age = sharedPrefs.getInt("age", 0)
            val adult = sharedPrefs.getBoolean("adult", false)

            etNameInput.setText(name)
            etAgeInput.setText(age.toString())
            cbAdult.isChecked = adult
        }
    }
}