package com.example.kotlinrecyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinrecyclerviewexample.adapter.MainRecyclerViewAdapter
import com.example.kotlinrecyclerviewexample.data.DataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainAdapter : MainRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSet()
    }

    private fun initRecyclerView(){
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val topSpacingItemDecoration = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingItemDecoration)
            mainAdapter = MainRecyclerViewAdapter()
            adapter = mainAdapter
        }
    }

    private fun addDataSet(){
        val data = DataSource.createMainData()
        mainAdapter.submitList(data)
    }
}
