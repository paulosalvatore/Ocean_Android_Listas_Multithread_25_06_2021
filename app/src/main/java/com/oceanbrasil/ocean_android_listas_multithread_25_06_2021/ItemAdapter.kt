package com.oceanbrasil.ocean_android_listas_multithread_25_06_2021

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Filme(
    val nome: String,
    val imagemUrl: String
)

class ItemAdapter(
    val items: List<Filme>
) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(item: Filme) {
            val ivImagem = itemView.findViewById<ImageView>(R.id.ivImagem)
            val tvNome = itemView.findViewById<TextView>(R.id.tvNome)

            tvNome.text = item.nome
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)
    }

    override fun getItemCount() = items.count()
}
