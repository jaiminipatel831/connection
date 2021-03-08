package com.example.connectivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val networkconnection = Networkconnection(applicationContext)
        networkconnection.observe(this, Observer { isConnected ->
            if(isConnected){
                layoutDisconnected.visibility = View.GONE
                layoutConnected.visibility = View.VISIBLE
            }else{
                layoutConnected.visibility = View.GONE
                layoutDisconnected.visibility = View.VISIBLE
            }
        })
    }
}