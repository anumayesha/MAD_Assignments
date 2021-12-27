package com.example.labterminal

import android.widget.Toast

import android.R

import android.os.Bundle

import android.app.Activity


class hello : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)
        Toast.makeText(baseContext, "Hello........", Toast.LENGTH_LONG).show()
    }
}