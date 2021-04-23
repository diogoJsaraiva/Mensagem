package com.example.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    companion object{
        val INFO_EXTRA_MENSAGEM = "MENSAGEM"
    }
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextTextPersonName)
        val mensagem = editTextMensagem.text.toString()

        val intent = Intent(this,MostraInformacaoActivity::class.java)
        intent.putExtra(INFO_EXTRA_MENSAGEM , mensagem)

        startActivity(intent)


    }
}