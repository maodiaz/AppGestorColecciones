package com.example.appgestorcolecciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class IngresoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso)

        val botonMiPerfil = findViewById<View>(R.id.caja_miperfil)
        botonMiPerfil.setOnClickListener {
            val intent = Intent(this, MiPerfilActivity::class.java)
            startActivity(intent)
        }

        val botonCrearColeccion = findViewById<View>(R.id.caja_crearcoleccion)
        botonCrearColeccion.setOnClickListener {
            val intent = Intent(this, CrearColeccionActivity::class.java)
            startActivity(intent)
        }
    }
}