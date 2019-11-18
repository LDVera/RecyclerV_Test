package com.diegov22.recyclerview_cursoa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var lista:RecyclerView? =null
    var adaptador:AdaptadorCustom?=null
    var layoutManager:RecyclerView.LayoutManager?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val info = ArrayList<Informa>()
        info.add(Informa("baner del tec", 2350.20, 4.0F, R.drawable.sin1))
        info.add(Informa("Student register", 23.20, 4.0F, R.drawable.sin2))
        info.add(Informa("TIC´s the best", 243.20, 4.0F, R.drawable.sin3))
        info.add(Informa("Cheese forever", 250.20, 5.0F, R.drawable.sin4))
        info.add(Informa("IDK", 22350.20, 8.0F, R.drawable.sin5 ))


        lista=findViewById(R.id.Lista)
        lista?.hasFixedSize()

        layoutManager = LinearLayoutManager(this)
        lista?.layoutManager = layoutManager

        adaptador = AdaptadorCustom(this, info)
        lista?.adapter = adaptador



    }
}
