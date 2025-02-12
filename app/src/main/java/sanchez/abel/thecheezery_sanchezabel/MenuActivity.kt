package sanchez.abel.thecheezery_sanchezabel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var btnCold: Button = findViewById(R.id.button_cold_drinks) as Button

        configurarBoton(R.id.button_cold_drinks, "coldDrinks")
        configurarBoton(R.id.button_hot_drinks, "hotDrinks")
        configurarBoton(R.id.button_sweets, "sweets")
        configurarBoton(R.id.button_salties, "salties")
        configurarBoton(R.id.button_hot_combos, "combos")
        configurarBoton(R.id.button_customizable, "custom")
    }
    private fun configurarBoton(idBoton: Int, categoria: String) {
        val boton: Button = findViewById(idBoton)
        boton.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("categoria", categoria)
            startActivity(intent)
        }
    }
}