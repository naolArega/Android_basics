package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_spinner.*

class SpinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val daysList = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val daysSpinnerAdapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, daysList)

        spDays.adapter = daysSpinnerAdapter

        spDays.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(
                    this@SpinnerActivity,
                    "You have selected the day ${p0?.getItemAtPosition(p2)}",
                    Toast.LENGTH_LONG
                ).show()
            }

        }

        spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(
                    this@SpinnerActivity,
                    "You have selected month of ${p0?.getItemAtPosition(p2)}",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}