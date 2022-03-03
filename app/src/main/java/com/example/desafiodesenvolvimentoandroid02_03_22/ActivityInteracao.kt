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

        var campo: EditText;
        var result : TextView;
        var boaNoite : Button;
        var bomDia : Button;

        campo = findViewById(R.id.etNome);
        boaNoite = findViewById(R.id.btBoaNoite) as Button;
        bomDia = findViewById(R.id.btBomDia);
        result = findViewById(R.id.tvResultado) as TextView;



        bomDia.setOnClickListener {
            result.text = "Bom dia " + campo.text;
        }

        boaNoite.setOnClickListener { result.text = "Boa noite " + campo.text; }

    }

}