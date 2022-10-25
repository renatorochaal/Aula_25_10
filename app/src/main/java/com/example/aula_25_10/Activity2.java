package com.example.aula_25_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    protected TextView textNome;
    protected TextView textIdade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);

        Bundle dados = getIntent().getExtras();
        Aluno objAluno = (Aluno)dados.getSerializable("objeto");
        textNome.setText(objAluno.getNome());
        textIdade.setText(Integer.toString(objAluno.getIdade()));
    }
}