package com.example.mensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostraInformacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_informacao)

        val textViewMensagem = findViewById<TextView>(R.id.textViewMensagem)
        val mensagem = intent.getStringExtra("MENSAGEM")


        textViewMensagem.setText(mensagem)

    }
}