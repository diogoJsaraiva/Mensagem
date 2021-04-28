package com.example.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.time.LocalDateTime
import java.util.*

class MainActivity : AppCompatActivity() {
    companion object{
        val INFO_EXTRA_MENSAGEM = "MENSAGEM"
        const val INFO_DATA = "DATA"

    }
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextTextPersonName)
        val mensagem = editTextMensagem.text.toString()






        if(mensagem.isBlank()){
            editTextMensagem.error =getString(R.string.Mensagem_vazia)
            return
        }


        val data = Date()

        val intent = Intent(this,MostraInformacaoActivity::class.java).apply {
            putExtra(INFO_EXTRA_MENSAGEM , mensagem)
            putExtra(INFO_DATA , data)
        }

        //intent.putExtra(INFO_EXTRA_MENSAGEM , mensagem)
        //intent.putExtra(INFO_DATA , data)





        startActivity(intent)






    }
}