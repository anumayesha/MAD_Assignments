package com.example.labterminal

import android.app.Service
import android.widget.Toast

import androidx.core.content.ContextCompat.startActivity

import android.content.Intent

import android.os.IBinder
import android.util.Log
import androidx.core.content.ContextCompat


class service : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        Toast.makeText(this, "My Service Stopped", Toast.LENGTH_LONG).show()
        Log.d(TAG, "onDestroy")
    }

    override fun onStart(intent: Intent?, startid: Int) {
        val intents = Intent(getBaseContext(), hello::class.java)
        intents.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intents)
        Toast.makeText(this, "My Service Started", Toast.LENGTH_LONG).show()
        Log.d(TAG, "onStart")
    }

    companion object {
        private const val TAG = "MyService"
    }
}