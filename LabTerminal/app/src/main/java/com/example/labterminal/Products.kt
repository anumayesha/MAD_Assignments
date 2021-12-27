package com.example.labterminal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_products.*

class Products : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val arrayList = ArrayList<model1>()
        arrayList.add(model1(id = 1, title="book"))
        arrayList.add(model1(id = 2, title="book1"))
        arrayList.add(model1(id = 3, title="book2"))
        arrayList.add(model1(id = 4, title="book3"))
        arrayList.add(model1(id = 5, title="book4"))
        arrayList.add(model1(id = 6, title="book5"))
        arrayList.add(model1(id = 7, title="book6"))


        val myAdapter = MyAdapter1(arrayList, this)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = myAdapter
    }


    override fun onSupportNavigateUp(): Boolean {
        super.onBackPressed()
        return true
    }

    fun onBackPressedBtn(view: View){
        val intent = Intent(this@Products, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}