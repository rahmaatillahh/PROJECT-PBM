package com.example.pbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class lokerdua : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnlokerdua : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lokerdua)

        btnlokerdua = findViewById(R.id.buttonback)
        btnlokerdua.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.buttonback -> {
                val IntentBiasa5 = Intent(this@lokerdua, infoker::class.java)
                startActivity(IntentBiasa5)
            }
        }
    }
}