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

            // Pegando o valor do textView txtEscolher e setando em variáveis de String e Int para
            // fazer as validações
            val escolhido = findViewById<TextView>(R.id.txtEscolher)
            val numeroEscolhido = escolhido.text.toString()
            val numeroInteiro = numeroEscolhido.toIntOrNull()

            // Número aleatório gerado pelo sorteio
            var numeroSorteado = Random().nextInt(11)


            // Chamando a função validarNumero. Caso positivo, comparar o número inserido pelo usuário
            // com o resultado do sorteio
            if (validarNumero(numeroEscolhido)) {
                if (numeroInteiro == numeroSorteado) {
                    texto.text = "Acertou!!! O número sorteado foi: " + numeroSorteado
                } else {
                    texto.text = "Errou!!! O número sorteado foi: " + numeroSorteado + " Mais sorte na próxima!"
                }
            } else {
                texto.text = "O número escolhido não é válido! Escolha entre 0 e 10"
            }
        }


    }

    fun validarNumero(numero: String): Boolean{
        val valor = numero.toIntOrNull()

        var validado: Boolean = true

        // Verifica se o número recebido pela função está nulo ou vazio e retorna false caso ocorra.
        if (numero == null || numero == ("")) {
            validado = false
            return validado
        }
        if (valor != null) {
            if (valor < 0 || valor > 10) {
                validado = false
            }
        }

        return validado
    }
}