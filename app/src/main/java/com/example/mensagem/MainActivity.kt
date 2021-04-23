package com.example.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    companion object{
        val INFO_EXTRA_MENSAGEM = "MENSAGEM"
        val INFO_DATA = "DATA"
    }
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextTextPersonName)
        val mensagem = editTextMensagem.text.toString()


        val data = LocalDateTime.



        if(mensagem.isBlank()){
            editTextMensagem.error =getString(R.string.Mensagem_vazia)
            return
        }

        val intent = Intent(this,MostraInformacaoActivity::class.java)

        intent.putExtra(INFO_EXTRA_MENSAGEM , mensagem)
        intent.putExtra(INFO_DATA,data)





        startActivity(intent)






    }
}