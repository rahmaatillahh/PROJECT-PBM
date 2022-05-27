package com.example.pbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class lokerempat : AppCompatActivity(), View.OnClickListener{
    private lateinit var btnlokerempat : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lokerempat)

        btnlokerempat = findViewById(R.id.buttonback)
        btnlokerempat.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.buttonback -> {
                val IntentBiasa7 = Intent(this@lokerempat, infoker::class.java)
                startActivity(IntentBiasa7)
            }
        }
    }
}