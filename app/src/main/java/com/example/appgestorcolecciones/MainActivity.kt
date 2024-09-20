package com.example.appgestorcolecciones

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.appgestorcolecciones.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonIngreso = findViewById<Button>(R.id.button_ingreso)
        buttonIngreso.setOnClickListener {
            val intent = Intent(this, IngresoActivity::class.java)
            startActivity(intent)
        }

        val buttonRegistro = findViewById<Button>(R.id.button_registro)
        buttonRegistro.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }
    }
}