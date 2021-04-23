package com.example.mensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.time.LocalDateTime

class MostraInformacaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_informacao)

        val textViewMensagem = findViewById<TextView>(R.id.textViewMensagem)
        val mensagem = intent.getStringExtra(MainActivity.INFO_EXTRA_MENSAGEM)

        val textViewHora = findViewById<TextView>(R.id.textViewHora);
        val hora = intent.getStringExtra(MainActivity.INFO_DATA)

        textViewMensagem.text = mensagem
        textViewHora.text = hora

    }
}