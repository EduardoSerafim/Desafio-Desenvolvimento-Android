package com.example.desafiodesenvolvimentoandroid02_03_22

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ActivityInteracao : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interacao)

        val campo: EditText;
        val result : TextView;
        val boaNoite : Button;
        val bomDia : Button;

        campo = findViewById(R.id.etNome);
        boaNoite = findViewById(R.id.btBoaNoite);
        bomDia = findViewById(R.id.btBomDia);
        result = findViewById(R.id.tvResultado);



        bomDia.setOnClickListener { result.text = "Bom dia ${campo.text}" }

        boaNoite.setOnClickListener { result.text = "Boa noite ${campo.text}" }

    }

}