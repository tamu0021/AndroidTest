package com.example.rakumeshi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import kotlinx.coroutines.experimental.DefaultDispatcher

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            runBlocking(DefaultDispatcher) { delay(3000) }
            val intent = Intent(this, SelectMenu::class.java)
            startActivity(intent)
        }
    }
}
