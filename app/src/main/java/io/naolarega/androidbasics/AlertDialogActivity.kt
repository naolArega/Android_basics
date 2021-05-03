package io.naolarega.androidbasics

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_alert_dialog.*

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        val dialogOne = AlertDialog.Builder(this).
                setTitle("Add Contact").
                setMessage("Would you like to add a contact").
                setIcon(R.drawable.ic_add_contact).
                setPositiveButton("Yes"){ _, _ ->
                    Toast.makeText(this, "Contact is added successfuly", Toast.LENGTH_LONG).show()
                }.
                setNegativeButton("No"){ _, _ ->
                    Toast.makeText(this, "Contact was not added", Toast.LENGTH_LONG).show()
                }.create()

        val dialogTwoOptions = arrayOf("Tea", "coffee", "Soft drink")

        val dialogTwo = AlertDialog.Builder(this).
            setTitle("Select a drink").
            setIcon(R.drawable.ic_drink).
            setSingleChoiceItems(dialogTwoOptions, 0){ _, i ->
                Toast.makeText(this, "You have selected ${dialogTwoOptions[i]}, please accept to confirm your choice", Toast.LENGTH_LONG).show()
            }.
            setPositiveButton("Ok"){ _, _ ->
                Toast.makeText(this, "Your drink will be waiting for you at the checkpoint", Toast.LENGTH_LONG).show()
            }.
            setNegativeButton("Cancel"){ _, _ ->
                Toast.makeText(this, "You can check the drinks any time if you like", Toast.LENGTH_LONG).show()
            }.create()

        val dialogThreeOptions = arrayOf("Salad", "Cheese", "Onion")
        val selectedOptions = booleanArrayOf(true, false, false)

        val dialogThree = AlertDialog.Builder(this).
            setTitle("Choose a topping").
            setIcon(R.drawable.ic_food).
            setMultiChoiceItems(dialogThreeOptions, selectedOptions ){ _, i, b ->
                if(b){
                    Toast.makeText(this, "You have choosen ${dialogThreeOptions[i]} for a topping", Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this, "You have removed ${dialogThreeOptions[i]} from your burger", Toast.LENGTH_LONG).show()
                }
            }.
            setPositiveButton("Finish") { _, _ ->
                Toast.makeText(this,"Your burger is getting prepared as we speak", Toast.LENGTH_LONG).show()
            }.
            setNegativeButton("Cancel") { _, _ ->
                Toast.makeText(this, "What happened don't you like our toppings", Toast.LENGTH_LONG).show()
            }.create()

        btnDialogOne.setOnClickListener {
            dialogOne.show()
        }

        btnDialogTwo.setOnClickListener {
            dialogTwo.show()
        }

        btnDialogThree.setOnClickListener {
            dialogThree.show()
        }
    }
}