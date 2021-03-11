package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//        supportFragmentManager
//            .beginTransaction()
//            .add(R.id.cont, BlankFragment())
        findViewById<TextView>(R.id.txt).setOnClickListener {
            val frag = DiaFragment()
            frag.show(supportFragmentManager, frag.tag)
        }


    }
}