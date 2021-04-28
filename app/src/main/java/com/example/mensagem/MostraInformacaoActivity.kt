package com.example.mensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.time.LocalDateTime
import java.util.*

class MostraInformacaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_informacao)

        val textViewMensagem = findViewById<TextView>(R.id.textViewMensagem)
        val mensagem = intent.getStringExtra(MainActivity.INFO_EXTRA_MENSAGEM)

        val textViewHora = findViewById<TextView>(R.id.textViewHora)
        val hora = intent.getSerializableExtra(MainActivity.INFO_DATA) as Date

        textViewMensagem.setText(mensagem)
        textViewHora.setText(hora.toString())

    }
}