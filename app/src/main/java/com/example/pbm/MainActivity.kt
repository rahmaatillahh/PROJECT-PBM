package com.example.pbm

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.utama)

        btnIntent = findViewById(R.id.button_utama)
        btnIntent.setOnClickListener(this)

        }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.button_utama -> {
                val IntentBiasa = Intent(this@MainActivity, ActivityUtama::class.java)
                startActivity(IntentBiasa)
            }
        }
    }
}