package com.example.pbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ActivityUtama : AppCompatActivity(), View.OnClickListener {

    private lateinit var btncariinfo : Button
    private lateinit var btncariinfo1 : Button
    private lateinit var btnback : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cariinfo)

        btncariinfo = findViewById(R.id.button_info_be)
        btncariinfo.setOnClickListener(this)

        btncariinfo1 = findViewById(R.id.button_info_lo)
        btncariinfo1.setOnClickListener(this)

        btnback = findViewById(R.id.buttonback)
        btnback.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_info_be -> {
                val IntentBiasa1 = Intent(this@ActivityUtama, Infobe::class.java)
                startActivity(IntentBiasa1)
            }
        }

        when(v.id) {
            R.id.button_info_lo -> {
                val IntentBiasa1 = Intent(this@ActivityUtama, infoker::class.java)
                startActivity(IntentBiasa1)
            }
        }

        when(v.id) {
            R.id.buttonback -> {
                val IntentBiasa1 = Intent(this@ActivityUtama, MainActivity::class.java)
                startActivity(IntentBiasa1)
            }
        }
    }
}