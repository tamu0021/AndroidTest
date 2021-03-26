package com.example.rakumeshi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_select_menu.*
import android.content.Intent
import kotlinx.coroutines.experimental.DefaultDispatcher

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

class SelectMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_menu)

        imageButton.setOnClickListener {
            runBlocking(DefaultDispatcher) { delay(3000) }
            val intent = Intent(this, DisplayRoute::class.java)
            startActivity(intent)
        }

    }
}
