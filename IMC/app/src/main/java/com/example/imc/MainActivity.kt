package com.example.imc

import IMC
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener(View.OnClickListener {
            var altura = edtIdade.text.toString().toDouble()
            var peso = edtPeso.text.toString().toDouble()

            val intent = Intent(this, ResultActivity::class.java)
            val imc = IMC(altura, peso)
            intent.putExtra("imc", imc)
            startActivity(intent)
        })
    }
}