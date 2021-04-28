package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_text.*

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        var firstNumber: Int
        var secondNumber: Int
        var result: Int

        btnAdd.setOnClickListener {
            firstNumber = tryParsing(etFirstNumber.text.toString())
            secondNumber = tryParsing(etSecondNumber.text.toString())

            result = addNumbers(firstNumber, secondNumber)

            tvResult.text = "Result: $result"
        }
    }

    private fun addNumbers(firstNumber: Int = 0, secondNumber: Int = 0): Int{
        return firstNumber + secondNumber
    }

    private fun tryParsing(value: String): Int{
        return if(value.isNotEmpty()){
            value.toInt()
        } else{
            0
        }
    }
}