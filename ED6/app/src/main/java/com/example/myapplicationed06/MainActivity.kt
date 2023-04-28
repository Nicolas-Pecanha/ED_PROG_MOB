package com.example.myapplicationed06

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttOla()
        buttTchau()
    }
    private fun buttOla()
    {
        val buttonOla = findViewById<Button>(R.id.buttonOla)
        buttonOla.setOnClickListener{
            val nbTelefone = "+5541992020753"
            val enviarMensagem = "Olá!Sou Android!"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://wa.me/$nbTelefone/?text=$enviarMensagem")
                    startActivity(intent)
        }
    }
    private fun buttTchau()
    {
        val buttonTchau = findViewById<Button>(R.id.buttonTchau)
        buttonTchau.setOnClickListener{
            val nbTelefone = "+5541992020753"
            val enviarMensagem = "Tchau!"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://wa.me/$nbTelefone/?text=$enviarMensagem")
            startActivity(intent)
        }
    }
}

