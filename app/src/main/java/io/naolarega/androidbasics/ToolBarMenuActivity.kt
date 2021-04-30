package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class ToolBarMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.miAddContact -> Toast.makeText(this, "Adding Contact", Toast.LENGTH_LONG).show()
            R.id.miFavorites -> Toast.makeText(this, "Opened Favorite", Toast.LENGTH_LONG).show()
            R.id.miSettings -> Toast.makeText(this, "Opened Settings", Toast.LENGTH_LONG).show()
            R.id.miFeedback -> Toast.makeText(this, "Giving Feedback", Toast.LENGTH_LONG).show()
            R.id.miCloseApp -> Toast.makeText(this, "Closing app", Toast.LENGTH_LONG).show()
        }
        return true
    }
}