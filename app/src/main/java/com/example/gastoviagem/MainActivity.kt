package com.example.gastoviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.gastoviagem.databinding.ActivityMainBinding

// View é uma interface, então eu posso lidar com ela como se fosse uma interface padrão
//
class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Isso aqui é possível fazer por que eu passei essa interface "nos atributos" dessa classe
        binding.buttonCalculate.setOnClickListener(this)
        // Aqui é utilizando o lambda: dentro dessas chaves vc pode escrever um bloco de código padrão
        // binding.buttonCalculate.setOnClickListener { escopo da função, bloco de código }
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_calculate) {
            calculate()
        }
    }

    // ^^^^^^ Boa prática: Todas as funções override são escritas primeiro

    private fun calculate() {
        // Notificação para o usuário quando ele realiza uma ação
        Toast.makeText(this, "Fui clicado", Toast.LENGTH_SHORT).show()
    }
}