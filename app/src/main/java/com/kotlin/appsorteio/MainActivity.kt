package com.kotlin.appsorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun sortearNumero(view: View){ // define primeiro nome: Tipo

        var texto = findViewById<TextView>(R.id.textSorteio)
        var numeroSorteado = Random().nextInt(11)

        texto.setText("Numero sorteado é: " + numeroSorteado)
    }
}
