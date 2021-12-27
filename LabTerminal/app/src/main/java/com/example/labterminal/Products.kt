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

        arrayList.add(model1(id = 3, title="book2"))
        val volley = volley<model1>()
        volley.add(model1(id = 1, title="book"))
        volley.add(model1(id = 2, title="book1"))
        volley.add(model1(id = 3, title="book2"))
        volley.add(model1(id = 4, title="book3"))
        volley.add(model1(id = 5, title="book4"))
        volley.add(model1(id = 6, title="book5"))
        volley.add(model1(id = 7, title="book6"))


        val myAdapter = MyAdapter1(com.example.labterminal.volley, this)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = myAdapter
    }

    private fun <T> volley(): volley {
        val url = "https://reqres.in/api/users"

        volley.add(model1(id = 1, title="book"))
        volley.add(model1(id = 2, title="book1"))
        volley.add(model1(id = 3, title="book2"))
        volley.add(model1(id = 4, title="book3"))
        volley.add(model1(id = 5, title="book4"))
        volley.add(model1(id = 6, title="book5"))
        volley.add(model1(id = 7, title="book6"))

        val myAdapter = MyAdapter1(com.example.labterminal.volley, this)
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