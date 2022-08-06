package com.example.roletaappk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRodarNumero = findViewById(R.id.btnRodar) as Button

        btnRodarNumero.setOnClickListener {
            var texto = findViewById<TextView>(R.id.txtSorteado)
            var numeroSorteado = Random().nextInt(11)
            texto.text = "O número sorteado é: " + numeroSorteado
        }
    }
}