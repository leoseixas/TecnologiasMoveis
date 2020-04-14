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
            add()
            val intent = Intent(this, ListActivity::class.java)
            intent.putExtra("cervejas", cervejas)
            startActivity(intent)
        })
    }

    fun add(){
        val cerveja = Cerveja(edtNome.text.toString(), edtMl.text.toString().toDouble(), edtValor.text.toString().toDouble())
        cervejas.add(cerveja)
    }



}
