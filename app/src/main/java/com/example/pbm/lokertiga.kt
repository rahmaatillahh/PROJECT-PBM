package com.example.pbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class lokertiga : AppCompatActivity(), View.OnClickListener{
    private lateinit var btnlokertiga : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lokertiga)

        btnlokertiga = findViewById(R.id.buttonback)
        btnlokertiga.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.buttonback -> {
                val IntentBiasa6 = Intent(this@lokertiga, infoker::class.java)
                startActivity(IntentBiasa6)
            }
        }
    }
}