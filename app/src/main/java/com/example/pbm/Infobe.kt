package com.example.pbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView

class Infobe : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnInfobe : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.infobe)

        btnInfobe = findViewById(R.id.buttonback)
        btnInfobe.setOnClickListener(this)

        val textInfo : TextView = findViewById(R.id.textInfo)
        val textInfo2 : TextView = findViewById(R.id.textInfo2)
        val textInfo3 : TextView = findViewById(R.id.textInfo3)
        val textInfo4 : TextView = findViewById(R.id.textInfo4)
        val textInfo5 : TextView = findViewById(R.id.textInfo5)
        val textInfo6 : TextView = findViewById(R.id.textInfo5)

        textInfo.movementMethod = LinkMovementMethod.getInstance()
        textInfo2.movementMethod = LinkMovementMethod.getInstance()
        textInfo3.movementMethod = LinkMovementMethod.getInstance()
        textInfo4.movementMethod = LinkMovementMethod.getInstance()
        textInfo5.movementMethod = LinkMovementMethod.getInstance()
        textInfo6.movementMethod = LinkMovementMethod.getInstance()

    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.buttonback -> {
                val IntentBiasa2 = Intent(this@Infobe, ActivityUtama::class.java)
                startActivity(IntentBiasa2)
            }
        }
    }
}