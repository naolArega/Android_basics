package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_check_box_radio_button.*

class CheckBoxRadioButtonActivity : AppCompatActivity() {
    var meatType: Array<Boolean> = arrayOf()

    data class Toppings(val name: String, var selected: Boolean)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box_radio_button)

        btnOrder.setOnClickListener {
            tvOrderResult.text = "You ordered a ${checkSelectedMeat()} burger topped with ${formatTopping(checkTopping())}"
        }
    }

    private fun checkSelectedMeat(): String{
        return when(rbgMeatType.checkedRadioButtonId){
            rbBeef.id -> "Beef"
            rbChicken.id -> "Chicken"
            rbPork.id -> "Pork"
            else -> "Nothing"
        }
    }

    private fun checkTopping(): MutableList<Toppings>{
        var toppings: MutableList<Toppings> = mutableListOf(
            Toppings("Salad", false),
            Toppings("Onion", false),
            Toppings("Cheese", false)
        )
        if(cbSalad.isChecked){
            toppings[0].selected = true
        }
        if(cbOnion.isChecked){
            toppings[1].selected = true
        }
        if(cbCheese.isChecked){
            toppings[2].selected = true
        }

        return toppings
    }

    private fun formatTopping(toppingsList: MutableList<Toppings>): String{
        var toppings: String = ""
        for(topping in toppingsList){
            if(topping.selected){
                toppings += "\n - ${topping.name}"
            }
        }

        return toppings
    }
}