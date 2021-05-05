package io.naolarega.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_slidable_layout.*

class SlidableLayoutActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slidable_layout)

        toggle = ActionBarDrawerToggle(this, dlSlidable, R.string.drawer_open, R.string.drawer_close)
        dlSlidable.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        nvNavBar.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miItemOne -> Toast.makeText(this, "Item one Selected", Toast.LENGTH_LONG).show()
                R.id.miItemTwo -> Toast.makeText(this, "Item two Selected", Toast.LENGTH_LONG).show()
                R.id.miItemThree -> Toast.makeText(this, "Item three Selected", Toast.LENGTH_LONG).show()
            }

            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}