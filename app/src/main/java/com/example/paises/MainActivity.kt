package com.example.paises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.paises.adapters.PaisAdapter
import com.example.paises.modelo.Pais

class MainActivity : AppCompatActivity() {
    var miRecycler: RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miRecycler = findViewById(R.id.MyRecycler)

        val listaPises = ArrayList<Pais>()

        listaPises.add(Pais("Mexico","https://slack-imgs.com/?c=1&o1=ro&url=https%3A%2F%2Fwww.tamaulipas.gob.mx%2Ffomentocivico%2Fwp-content%2Fuploads%2Fsites%2F20%2F2017%2F04%2Fbandera-mexico-portavox-e1492461746506.jpg"))
        listaPises.add(Pais("EUA","https://slack-imgs.com/?c=1&o1=ro&url=https%3A%2F%2Fwww.lifeder.com%2Fwp-content%2Fuploads%2F2018%2F11%2Fbandera-1795-1818.png"))


        miRecycler!!.layoutManager = GridLayoutManager(this,1)
        miRecycler!!.setHasFixedSize(true)
        miRecycler!!.adapter = PaisAdapter(listaPises,this)
    }
}