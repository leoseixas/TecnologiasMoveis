package com.example.ap1

import Cerveja
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    val cervejas = arrayListOf<Cerveja>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnAdd.setOnClickListener(View.OnClickListener {
            var nome =edtNome.text.toString()
            var ml = edtMl.text.toString().toDouble()
            var valor = edtValor.text.toString().toDouble()

            val intent = Intent(this, ListActivity::class.java)

            cervejas.add(Cerveja(nome, ml, valor))

            intent.putExtra("cervejas", cervejas)
            startActivity(intent)
        })
    }



}
