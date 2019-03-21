package com.zestzone.handlerexplore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message

class MainActivity : AppCompatActivity() {

    val handler = Handler { message: Message ->
        when (message.what) {
            1 -> println("hello 1")
            2 -> println("hello 2")
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
