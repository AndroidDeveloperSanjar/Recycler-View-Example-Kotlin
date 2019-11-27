package com.example.kotlinrecyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinrecyclerviewexample.R
import com.example.kotlinrecyclerviewexample.data.model.MainResponse
import kotlinx.android.synthetic.main.main_item_list.view.*

class MainRecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items : List<MainResponse> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MainViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.main_item_list,parent,false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is MainViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(mainList: List<MainResponse>){
        items = mainList
    }

    class MainViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {

        private val type = itemView.tv_type
        private val region = itemView.tv_region
        private val year = itemView.tv_year
        private val name = itemView.tv_name
        private val work = itemView.tv_work

        fun bind(mainResponse: MainResponse) {
            type.text = mainResponse.type
            region.text = mainResponse.region
            year.text = mainResponse.year
            name.text = mainResponse.name
            work.text = mainResponse.work
        }
    }
}