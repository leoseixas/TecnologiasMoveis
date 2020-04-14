package com.example.ap1

import Cerveja
import CervejaAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*
import java.util.ArrayList

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        onBackPressed()
        btnCerveja.setOnClickListener(View.OnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        })

        val cerveja = intent.getParcelableArrayListExtra<Cerveja>("cervejas")
        val adapter = CervejaAdapter(applicationContext, cerveja)
        recycler.layoutManager = LinearLayoutManager(applicationContext)
        recycler.itemAnimator = DefaultItemAnimator()
        recycler.adapter = adapter
    }




}