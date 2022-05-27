package com.example.pbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class infoker : AppCompatActivity(), View.OnClickListener {

    private lateinit var btninfoker1 : Button
    private lateinit var btninfoker2 : Button
    private lateinit var btninfoker3 : Button
    private lateinit var btninfoker4 : Button
    private lateinit var btnback : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.infoker)

        btninfoker1 = findViewById(R.id.linklo1)
        btninfoker1.setOnClickListener(this)

        btninfoker2 = findViewById(R.id.linklo2)
        btninfoker2.setOnClickListener(this)

        btninfoker3 = findViewById(R.id.linklo3)
        btninfoker3.setOnClickListener(this)

        btninfoker4 = findViewById(R.id.linklo4)
        btninfoker4.setOnClickListener(this)

        btnback = findViewById(R.id.buttonback)
        btnback.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.linklo1 -> {
                val IntentBiasa3 = Intent(this@infoker, lokersatu::class.java)
                startActivity(IntentBiasa3)
            }
        }

        when(v.id) {
            R.id.linklo2 -> {
                val IntentBiasa3 = Intent(this@infoker, lokerdua::class.java)
                startActivity(IntentBiasa3)
            }
        }

        when(v.id) {
            R.id.linklo3 -> {
                val IntentBiasa3 = Intent(this@infoker, lokertiga::class.java)
                startActivity(IntentBiasa3)
            }
        }

        when(v.id) {
            R.id.linklo4 -> {
                val IntentBiasa3 = Intent(this@infoker, lokerempat::class.java)
                startActivity(IntentBiasa3)
            }
        }

        when(v.id) {
            R.id.buttonback -> {
                val IntentBiasa3 = Intent(this@infoker, ActivityUtama::class.java)
                startActivity(IntentBiasa3)
            }
        }
    }
}