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

        // Instanciando o botão, utilizando o findViewById para recuperar informações do activity_main.xml
        val btnRodarNumero = findViewById(R.id.btnRodar) as Button

        // Criando o evento de Listener de Click para o botão
        // Mapeando o textView que exibirá o valor sorteado com o findViewById,
        // feito o sorteio, utilizando o Random() do java utils
        // e gerando a mensagem com o valor sorteado, que será exibido na tela
        btnRodarNumero.setOnClickListener {
            var texto = findViewById<TextView>(R.id.txtSorteado)
            var numeroSorteado = Random().nextInt(11)
            texto.text = "O número sorteado é: " + numeroSorteado
        }
    }
}