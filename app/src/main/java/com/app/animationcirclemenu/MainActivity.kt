package com.app.animationcirclemenu

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ramotion.circlemenu.CircleMenuView

class MainActivity : AppCompatActivity() {

    var menu: CircleMenuView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menu = findViewById(R.id.circle_menu)
        menu!!.eventListener = object : CircleMenuView.EventListener() {
            override fun onMenuOpenAnimationStart(view: CircleMenuView) {
                Toast.makeText(this@MainActivity, "onMenuOpenAnimationStart", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onMenuOpenAnimationEnd(view: CircleMenuView) {
                Toast.makeText(this@MainActivity, "onMenuOpenAnimationEnd", Toast.LENGTH_SHORT)
                    .show()
           }

            override fun onMenuCloseAnimationStart(view: CircleMenuView) {
                Toast.makeText(this@MainActivity, "onMenuCloseAnimationStart", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onMenuCloseAnimationEnd(view: CircleMenuView) {
                Toast.makeText(this@MainActivity, "onMenuCloseAnimationEnd", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onButtonClickAnimationStart(view: CircleMenuView, index: Int) {
                Toast.makeText(this@MainActivity, "onButtonClickAnimationStart", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onButtonClickAnimationEnd(view: CircleMenuView, index: Int) {
                Toast.makeText(this@MainActivity, "onButtonClickAnimationEnd", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onButtonLongClick(view: CircleMenuView, index: Int): Boolean {
                Toast.makeText(this@MainActivity, "onButtonLongClick", Toast.LENGTH_SHORT)
                    .show()
                return true
            }

            override fun onButtonLongClickAnimationStart(view: CircleMenuView, index: Int) {
                Toast.makeText(this@MainActivity, "onButtonLongClickAnimationStart", Toast.LENGTH_SHORT)
                    .show()

            }

            override fun onButtonLongClickAnimationEnd(view: CircleMenuView, index: Int) {
                Toast.makeText(this@MainActivity, "onButtonLongClickAnimationEnd", Toast.LENGTH_SHORT)
                    .show()

            }
        }
    }

}