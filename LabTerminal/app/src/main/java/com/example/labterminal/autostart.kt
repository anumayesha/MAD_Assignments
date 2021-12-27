package com.example.labterminal

import android.os.Build

import android.content.Intent

import android.content.BroadcastReceiver
import android.content.Context
import android.util.Log


class autostart : BroadcastReceiver() {
    override fun onReceive(context: Context, arg1: Intent?) {
        val intent = Intent(context, service::class.java)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            context.startForegroundService(intent)
        } else {
            context.startService(intent)
        }
        Log.i("Autostart", "started")
    }
}