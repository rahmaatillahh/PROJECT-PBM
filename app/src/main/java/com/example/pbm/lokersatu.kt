package com.example.pbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class lokersatu : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnlokersatu : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lokersatu)

        btnlokersatu = findViewById(R.id.buttonback)
        btnlokersatu.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.buttonback -> {
                val IntentBiasa4 = Intent(this@lokersatu, infoker::class.java)
                startActivity(IntentBiasa4)
            }
        }
    }
}