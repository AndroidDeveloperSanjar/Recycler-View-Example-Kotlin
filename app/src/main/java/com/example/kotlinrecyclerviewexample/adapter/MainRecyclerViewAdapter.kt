package com.example.kotlinrecyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
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

        private val imageview = itemView.image_view
        private val title = itemView.tv_title
        private val username = itemView.tv_full_name

        fun bind(mainResponse: MainResponse) {

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.icon_progress)
                .error(R.drawable.icon_progress)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(mainResponse.image)
                .into(imageview)
            title.text = mainResponse.title
            username.text = mainResponse.username
        }
    }
}