package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = arrayOf("sumar", "restar", "multiplicar", "dividir")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)
        spinner.adapter = adaptador1
        btn_Calcular.setOnClickListener {
            when (spinner.selectedItem.toString()) {
                "sumar" -> txt_Promedio.text = "Resultado: ${txt_NumeroUno.text.toString().toInt() + txt_NumeroDos.text.toString().toInt()}"
                "restar" -> txt_Promedio.text = "Resultado: ${txt_NumeroUno.text.toString().toInt() - txt_NumeroDos.text.toString().toInt()}"
                "multiplicar" -> txt_Promedio.text = "Resultado: ${txt_NumeroUno.text.toString().toInt() * txt_NumeroDos.text.toString().toInt()}"
                "dividir" -> txt_Promedio.text = "Resultado: ${txt_NumeroUno.text.toString().toFloat() / txt_NumeroDos.text.toString().toFloat()}"
            }
        }
    }
}