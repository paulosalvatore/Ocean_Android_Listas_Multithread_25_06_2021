package com.oceanbrasil.ocean_android_listas_multithread_25_06_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adapter -> É uma classe do Android que serve como base para a lista
        //          Cada lista precisa de um adapter customizado
        //          A customização serve para dizer como o adapter irá carregar elementos
        //          Além disso, o adapter define o Layout XML de cada item,
        //          e como faremos para inserir informações nesse layout

        // LayoutManager -> Também é uma classe do Android que usamos para definir
        //                  como uma lista será estruturada
        //                  As opções são: Linear (Horizontal ou Vertical), Staggered, etc

        val rvLista = findViewById<RecyclerView>(R.id.rvLista)

        rvLista.layoutManager = LinearLayoutManager(this)

        val harryPotter = Filme("Harry Potter", "https://static.wikia.nocookie.net/harrypotter/images/9/9c/Capa_Harry_Potter_e_a_Pedra_Filosofal_%28filme%29.jpg/revision/latest?cb=20130101153136&path-prefix=pt-br")
        val senhorDosAneis = Filme("Senhor dos Anéis", "https://upload.wikimedia.org/wikipedia/pt/3/38/Lord_of_the_Rings_Fellowship_of_the_Ring.jpg")
        val rambo = Filme("Rambo", "https://midia.gruposinos.com.br/_midias/png/2017/10/27/rambo-3241333.png")

        val items = listOf(harryPotter, senhorDosAneis, rambo)

        rvLista.adapter = ItemAdapter(items)
    }
}
