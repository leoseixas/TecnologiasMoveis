package com.example.lista_cerveja

import Cerveja
import CervejaAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val cervejas = arrayListOf<Cerveja>()
    val adapter = CervejaAdapter(cervejas)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnAdd.setOnClickListener(View.OnClickListener {
            add()
        })
    }

    fun add(){

        if (edtNome.text.toString().length>=3 && edtVolume.text.toString().length>=1 && edtValor.text.toString().length>=1){
            val cerveja = Cerveja(edtNome.text.toString(),edtVolume.text.toString().toDouble(), edtValor.text.toString().toDouble())
            edtNome.text.clear()
            edtVolume.text.clear()
            edtValor.text.clear()

            cervejas.add(cerveja)
            cervejas.sortBy {it.valor}
            initRecycleView()
        }else{
            Toast.makeText(this, "Nome, volume ou valor, Muito curdo", Toast.LENGTH_SHORT).show()
        }
    }

    fun initRecycleView(){
        recycler.adapter=adapter
        val layout = LinearLayoutManager(this)
        recycler.layoutManager=layout
    }


}

