package com.example.appgestorcolecciones

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class IngresoActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso)

        drawerLayout = findViewById(R.id.drawer_layout)
        val navigationView: NavigationView = findViewById(R.id.nav_view)
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navigationView.setNavigationItemSelectedListener { menuItem ->
            menuItem.isChecked = true
            drawerLayout.closeDrawers()

            when (menuItem.itemId) {
                R.id.nav_mi_perfil -> {
                    val intent = Intent(this, MiPerfilActivity::class.java)
                    startActivity(intent)
                }
                R.id.nav_crear_coleccion -> {
                    val intent = Intent(this, CrearColeccionActivity::class.java)
                    startActivity(intent)
                }
                R.id.nav_mis_colecciones -> {
                    val intent = Intent(this, MisColeccionesActivity::class.java)
                    startActivity(intent)
                }
                R.id.nav_cerrar_sesion -> {
                    // Handle "Cerrar Sesión" action
                }
            }
            true
        }
    }
}