package com.hbm.holamundo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Saluda : AppCompatActivity() {
    private lateinit var tvResult : TextView
    private lateinit var name : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saluda)

        tvResult = findViewById<TextView>(R.id.tvResult)
        name = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text = "Hola $name"
    }
}